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
		
	}

}
