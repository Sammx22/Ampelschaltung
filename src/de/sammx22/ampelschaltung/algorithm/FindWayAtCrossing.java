package de.sammx22.ampelschaltung.algorithm;

import de.sammx22.ampelschaltung.modells.Car;
import de.sammx22.ampelschaltung.modells.Lane;

public class FindWayAtCrossing {
	public static void changeLane(Lane lane, Lane destination, Car car) {
		destination.addCar(car, destination);
		lane.removeCar(car);
		
	}
	
	
}
