package de.sammx22.ampelschaltung.algorithm;

import de.sammx22.ampelschaltung.models.Car;
import de.sammx22.ampelschaltung.models.Lane;

public class FindWayAtCrossing {
	private static void changeLane(Lane destination, Car car) {
		car.getLane().removeCar(car);
		destination.addCar(car, destination);
	}
	private static void changeLaneIterator(Lane destination, Car car) {
		
	}
	
	public static void changeStreetatCrossing(Car car) {
		changeLaneIterator(null, car);
	}
	
}
