package de.sammx22.ampelschaltung.main;

import de.sammx22.ampelschaltung.algorithm.ChangeTrafficLight;
import de.sammx22.ampelschaltung.algorithm.FindWayAtCrossing;
import de.sammx22.ampelschaltung.algorithm.GenerateCars;
import de.sammx22.ampelschaltung.models.Car;
import de.sammx22.ampelschaltung.models.Crossing;
import de.sammx22.ampelschaltung.models.Lane;
import de.sammx22.ampelschaltung.models.Street;
import de.sammx22.ampelschaltung.models.directions.Direction;

public class Main {

	public static void main(String[] args) {
		final String finalleft = "left";
		final String finalfront = "front";
		final String finalright = "right";
		
		Direction left = new Direction(finalleft);
		Direction rightWithLight = new Direction(finalright,true);
		Direction right = new Direction(finalright);
		Direction front = new Direction(finalfront);
		
		Lane leftLaneXP = new Lane(left);
		Lane leftLaneXN = new Lane(left);
		Lane leftLaneYP = new Lane(left);
		Lane leftLaneYN = new Lane(left);
		Lane frontLaneXP = new Lane(front);
		Lane frontLaneXN = new Lane(front);
		Lane frontLaneYP = new Lane(front);
		Lane frontLaneYN = new Lane(front);
		Lane rightLaneXP = new Lane(rightWithLight);
		Lane rightLaneXN = new Lane(rightWithLight);
		Lane rightLaneYP = new Lane(right);
		Lane rightLaneYN = new Lane(right);
		
		Street streetXP = new Street("XP");
		streetXP.addLane(leftLaneXP);
		streetXP.addLane(frontLaneXP);
		streetXP.addLane(rightLaneXP);
		Street streetXN = new Street("XN");
		streetXN.addLane(leftLaneXN);
		streetXN.addLane(frontLaneXN);
		streetXN.addLane(rightLaneXN);
		Street streetYP = new Street("YP");
		streetYP.addLane(leftLaneYP);
		streetYP.addLane(frontLaneYP);
		streetYP.addLane(rightLaneYP);
		Street streetYN = new Street("YN");
		streetYN.addLane(leftLaneYN);
		streetYN.addLane(frontLaneYN);
		streetYN.addLane(rightLaneYN);
		
		Crossing c = new Crossing(streetXP, streetXN, streetYP, streetYN);
		//System.out.println(c.getStreetXN().getLanes().get(1).getTrafficLight().get(0).toString());
		//System.out.println(c.getStreetXN().getLanes().get(2).getIndex());
		Car car = new Car();
		GenerateCars.generateLane(c, car);
		//System.out.println("lane"+car.getLane());
		System.out.println("street"+car.getStreet().getOrientation());
		GenerateCars.generateDest(c, car);
		System.out.println("dest"+car.getdest().getOrientation());
		
		System.out.println("start"+car.getLane().getDirection().get(0).getDirection());
		ChangeTrafficLight.toggleTrafficLightsXY(c);
		FindWayAtCrossing.changeStreetAtCrossing(car, car.getdest());
		System.out.println("end"+car.getLane().getDirection().get(0).getDirection());
		System.out.println("end"+car.getStreet().getOrientation());
		
		System.out.println("dest"+car.getdest().getOrientation());
		System.out.println("start"+car.getLane().getDirection().get(0).getDirection());
		ChangeTrafficLight.toggleTrafficLightsXY(c);
		FindWayAtCrossing.changeStreetAtCrossing(car, car.getdest());
		System.out.println("end"+car.getLane().getDirection().get(0).getDirection());
		System.out.println("end"+car.getStreet().getOrientation());
		
		
		
		
	//https://pastebin.com/FFGjcdhp
	
	}
}
