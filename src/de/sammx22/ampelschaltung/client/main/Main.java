package de.sammx22.ampelschaltung.client.main;

import java.awt.Color;

import de.sammx22.ampelschaltung.api.algorithm.ChangeTrafficLight;
import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Crossing;
import de.sammx22.ampelschaltung.client.algorithm.GenerateAndMove;
import de.sammx22.ampelschaltung.client.models.CarModel;
import de.sammx22.ampelschaltung.client.models.CrossingModel;
import de.sammx22.ampelschaltung.client.models.TrafficLightModel;
import sas.*;
import sasio.Button;

public class Main {

	public static void main(String[] args) {
		
		View v = new View(1920,1080,"Ampelsystem");
		
		CrossingModel cM = new CrossingModel();
		CarModel carM = new CarModel();
		TrafficLightModel tLM = new TrafficLightModel();
		
		cM.getSprite();
		tLM.getXN();
		tLM.getXP();
		tLM.getYN();
		tLM.getYP();
		carM.getCar();
		
		Crossing c = GenerateAndMove.generateCrossing();
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

}
