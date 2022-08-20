package de.sammx22.ampelschaltung.main;

import de.sammx22.ampelschaltung.modells.Crossing;
import de.sammx22.ampelschaltung.modells.Lane;
import de.sammx22.ampelschaltung.modells.Street;
import de.sammx22.ampelschaltung.modells.directions.Direction;


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
		
		Street streetXP = new Street();
		streetXP.addLane(leftLaneXP);
		streetXP.addLane(frontLaneXP);
		streetXP.addLane(rightLaneXP);
		Street streetXN = new Street();
		streetXN.addLane(leftLaneXN);
		streetXN.addLane(frontLaneXN);
		streetXN.addLane(rightLaneXN);
		Street streetYP = new Street();
		streetYP.addLane(leftLaneYP);
		streetYP.addLane(frontLaneYP);
		streetYP.addLane(rightLaneYP);
		Street streetYN = new Street();
		streetYN.addLane(leftLaneYN);
		streetYN.addLane(frontLaneYN);
		streetYN.addLane(rightLaneYN);
		
		Crossing c = new Crossing(streetXP, streetXN, streetYP, streetYN);
		System.out.println(c.getStreetXN().getLanes().get(2).getTrafficLight().get(0).toString());
	}
}
