package de.sammx22.ampelschaltung.algorithm;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import de.sammx22.ampelschaltung.modells.Car;
import de.sammx22.ampelschaltung.modells.Crossing;
import de.sammx22.ampelschaltung.modells.Street;

public class GenerateCars {
	
	static int sprobabilityXPLane = 75;
	static int sprobabilityXNLane = 50;
	static int sprobabilityYPLane = 25;
	static int sprobabilityYNLane = 0;
	static int[] sprobabilityLane = {sprobabilityXPLane, sprobabilityXNLane, sprobabilityYPLane, sprobabilityYNLane};
	
	public static void setProbabilityLane(int probabilityXPLane, int probabilityXNLocation,int probabilityYPLocation,int probabilityYNLocation) {
		sprobabilityXPLane = probabilityXPLane;
		sprobabilityXNLane = probabilityXNLocation;
		sprobabilityYPLane = probabilityYPLocation;
		sprobabilityYNLane = probabilityYNLocation;
	}
	
	
	
	
	public static void generateLane(Crossing c, Car car) {
		
		
		Arrays.sort(sprobabilityLane);
		
		Random myRandom=new Random();  
		final int ran = myRandom.nextInt(100);
		final int ranLaneXP = myRandom.nextInt(c.getStreetXP().getLanes().size());
		final int ranLaneXN = myRandom.nextInt(c.getStreetXP().getLanes().size());
		final int ranLaneYP = myRandom.nextInt(c.getStreetXP().getLanes().size());
		final int ranLaneYN = myRandom.nextInt(c.getStreetXP().getLanes().size());
	
		if (ran >= sprobabilityLane[3]) { 
		
			if(sprobabilityLane[3] ==sprobabilityXPLane) {
				car.setLane(c.getStreetXP().getLanes().get(ranLaneXP));
			}else if(sprobabilityLane[3] ==sprobabilityXNLane) {
				car.setLane(c.getStreetXN().getLanes().get(ranLaneXN));
			}if(sprobabilityLane[3] ==sprobabilityYPLane) {
				car.setLane(c.getStreetYP().getLanes().get(ranLaneYP));
			}else {
				car.setLane(c.getStreetYN().getLanes().get(ranLaneYN));
			}
			
			
		}
		else if (ran >= sprobabilityLane[2]) { 
			if(sprobabilityLane[2] ==sprobabilityXPLane) {
				car.setLane(c.getStreetXP().getLanes().get(ranLaneXP));
			}else if(sprobabilityLane[2] ==sprobabilityXNLane) {
				car.setLane(c.getStreetXN().getLanes().get(ranLaneXN));
			}if(sprobabilityLane[2] ==sprobabilityYPLane) {
				car.setLane(c.getStreetYP().getLanes().get(ranLaneYP));
			}else {
				car.setLane(c.getStreetYN().getLanes().get(ranLaneYN));
			}
		} 
		else if (ran >= sprobabilityLane[1]) { 
			if(sprobabilityLane[1] ==sprobabilityXPLane) {
				car.setLane(c.getStreetXP().getLanes().get(ranLaneXP));
			}else if(sprobabilityLane[1] ==sprobabilityXNLane) {
				car.setLane(c.getStreetXN().getLanes().get(ranLaneXN));
			}if(sprobabilityLane[1] ==sprobabilityYPLane) {
				car.setLane(c.getStreetYP().getLanes().get(ranLaneYP));
			}else {
				car.setLane(c.getStreetYN().getLanes().get(ranLaneYN));
			}
		} 
		else { 
			if(sprobabilityLane[0] >=sprobabilityXPLane) {
				car.setLane(c.getStreetXP().getLanes().get(ranLaneXP));
			}else if(sprobabilityLane[0] ==sprobabilityXNLane) {
				car.setLane(c.getStreetXN().getLanes().get(ranLaneXN));
			}if(sprobabilityLane[0] ==sprobabilityYPLane) {
				car.setLane(c.getStreetYP().getLanes().get(ranLaneYP));
			}else {
				car.setLane(c.getStreetYN().getLanes().get(ranLaneYN));
			}
		}
		
	}
}
