package de.sammx22.ampelschaltung.api.main;

import de.sammx22.ampelschaltung.api.algorithm.ChangeTrafficLight;
import de.sammx22.ampelschaltung.api.algorithm.FindWayAtCrossing;
import de.sammx22.ampelschaltung.api.algorithm.GenerateCars;
import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Crossing;
import de.sammx22.ampelschaltung.api.models.Lane;
import de.sammx22.ampelschaltung.api.models.Street;
import de.sammx22.ampelschaltung.api.models.directions.Direction;
import sas.View;

public class Main {

	public static void main(String[] args) {
	
		final String finalleft = "left";
		final String finalfront = "front";
		final String finalright = "right";
		final String finalback = "back";
		
		Direction left = new Direction(finalleft);
		Direction rightWithLight = new Direction(finalright,true);
		Direction right = new Direction(finalright);
		Direction front = new Direction(finalfront);
		Direction back = new Direction(finalback);
		
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
		Lane backLaneXP = new Lane(back);
		Lane backLaneXN = new Lane(back);
		Lane backLaneYP = new Lane(back);
		Lane backLaneYN = new Lane(back);
		
		Street streetXP = new Street("XP");
		streetXP.addLane(backLaneXP);
		streetXP.addLane(leftLaneXP);
		streetXP.addLane(frontLaneXP);
		streetXP.addLane(rightLaneXP);
		
		Street streetXN = new Street("XN");
		streetXN.addLane(backLaneXN);
		streetXN.addLane(leftLaneXN);
		streetXN.addLane(frontLaneXN);
		streetXN.addLane(rightLaneXN);
		Street streetYP = new Street("YP");
		streetYP.addLane(backLaneYP);
		streetYP.addLane(leftLaneYP);
		streetYP.addLane(frontLaneYP);
		streetYP.addLane(rightLaneYP);
		Street streetYN = new Street("YN");
		streetYN.addLane(backLaneYN);
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
