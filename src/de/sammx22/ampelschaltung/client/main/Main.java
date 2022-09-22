package de.sammx22.ampelschaltung.client.main;

import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Crossing;
import de.sammx22.ampelschaltung.client.algorithm.GenerateAndMove;
import de.sammx22.ampelschaltung.client.models.CarModel;
import de.sammx22.ampelschaltung.client.models.CrossingModel;
import sas.*;

public class Main {

	public static void main(String[] args) {
		View v = new View(1920,1080,"Ampelsystem");
		CrossingModel cM = new CrossingModel();
		CarModel carM = new CarModel();
		cM.getSprite();
		carM.getCar();
		Crossing c = GenerateAndMove.generateCrossing();
		Car car = GenerateAndMove.generateCar(c, carM);
		
		while(car.getAtLine()) {
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
