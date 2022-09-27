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
import de.sammx22.ampelschaltung.client.threats.TrafficlightThread;
import sas.*;
import sasio.Button;

public class Main  extends Thread {

	
	
	TrafficLightModel ttLM;
	Crossing tc;
	CarModel tcarM;
	Car tcar;

	public Main(TrafficLightModel ttLM,Crossing tc,CarModel tcarM,Car tcar) {
		this.ttLM = ttLM;
		this.tc = tc;
		this.tcarM=tcarM;
		this.tcar = tcar;
	}
	
	
	
	
	public static void main(String[] args) {
		
		View v = new View(1920,1080,"Ampelsystem");
		
		CrossingModel cM = new CrossingModel();
		
		TrafficLightModel tLM = new TrafficLightModel();
		
		
	
		cM.getSprite();
		tLM.getXN();
		tLM.getXP();
		tLM.getYN();
		tLM.getYP();
		
		
		
		Crossing c = GenerateAndMove.generateCrossing();
		TrafficlightThread t = new TrafficlightThread(tLM, c);
		GenerateAndMove.setTrafficLight(c, tLM);
		ChangeTrafficLight.toggleTrafficLightsXY(c);
		t.start();
		CarModel carM = new CarModel();
		carM.getCar();
		Car car = GenerateAndMove.generateCar(c, carM);
		
		
		
		System.out.println("test");
		 while(true) {
			 //GenerateAndMove.setTrafficLight(c, tLM);
				changeStreet(carM, car,c);
				
		 }
		
		
	}
	
	public static void changeStreet(CarModel carM, Car car, Crossing c) {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(car.getAtLine()) {
			System.out.println("atline");
			if(car.getLane().getTrafficLight().get(0).getStatus()=="green") {
			System.out.println("atline" + car.getLane().getDirection().get(0).getDirection());
			switch(car.getLane().getDirection().get(0).getDirection()) {
			case "left":
				if(car.getStreet().getOrientation()==car.getdest().getOrientation()) {
					GenerateAndMove.turnBack(carM, car);
				}else {
					GenerateAndMove.turnLeft(carM, car);
				}
				ChangeTrafficLight.toggleTrafficLightsXY(c);
				break;
			case "front":
				GenerateAndMove.turnFront(carM, car);
				ChangeTrafficLight.toggleTrafficLightsXY(c);
				break;
			case "right":
				GenerateAndMove.turnRight(carM, car);
				ChangeTrafficLight.toggleTrafficLightsXY(c);
				break;
				
			}
			car.setAtLine(false);
			System.out.println("setfalse");
			}
		}
		
	}
	



}
