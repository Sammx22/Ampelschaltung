package de.sammx22.ampelschaltung.client.main;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

import de.sammx22.ampelschaltung.api.algorithm.ChangeTrafficLight;
import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Crossing;
import de.sammx22.ampelschaltung.client.algorithm.GenerateAndMove;
import de.sammx22.ampelschaltung.client.models.CarModel;
import de.sammx22.ampelschaltung.client.models.CrossingModel;
import de.sammx22.ampelschaltung.client.models.TrafficLightModel;
import sas.*;
import sasio.Button;

public class Main  extends Thread {

	static Crossing c;
	static TrafficLightModel tLM;
	
	public static Crossing getCrossing() {
		return c;
		
	}
	
	public static void main(String[] args) {
		
		View v = new View(1920,1080,"Ampelsystem");
		
		CrossingModel cM = new CrossingModel();
		CarModel carM = new CarModel();
		tLM = new TrafficLightModel();
		Main thread = new Main();
		cM.getSprite();
		tLM.getXN();
		tLM.getXP();
		tLM.getYN();
		tLM.getYP();
		carM.getCar();
		
		
		c = GenerateAndMove.generateCrossing();
		thread.start();
		Car car = GenerateAndMove.generateCar(c, carM);
		ChangeTrafficLight.toggleTrafficLightsXY(c);
		
		while(true) {
		
		GenerateAndMove.setTrafficLight(c, tLM);
		changeStreet(carM, car);
		}
		
	}
	
	public static void changeStreet(CarModel carM, Car car) {
		
		while(car.getAtLine()) {
			if(car.getLane().getTrafficLight().get(0).getStatus()=="green") {
			System.out.println("atline" + car.getLane().getDirection().get(0).getDirection());
			switch(car.getLane().getDirection().get(0).getDirection()) {
			case "left":
				if(car.getStreet().getOrientation()==car.getdest().getOrientation()) {
					GenerateAndMove.turnBack(carM, car);
				}else {
					GenerateAndMove.turnLeft(carM, car);
				}
				break;
			case "front":
				GenerateAndMove.turnFront(carM, car);
				break;
			case "right":
				GenerateAndMove.turnRight(carM, car);
				break;
				
			}
			car.setAtLine(false);
			System.out.println("setfalse");
			}
		}
		
	}
	
	public void run() {
	    while(true) {
	    	System.out.println("thread"+c.toString());
	    	System.out.println("tlM"+tLM.toString());
	    	ChangeTrafficLight.toggleTrafficLightsXY(getCrossing());
	    	
	    	
	    	try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	  }
	

}
