package de.sammx22.ampelschaltung.api.algorithm;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Crossing;
import de.sammx22.ampelschaltung.api.models.Street;

public class GenerateCars {
	
	static int sprobabilityXPLane = 75;
	static int sprobabilityXNLane = 50;
	static int sprobabilityYPLane = 25;
	static int sprobabilityYNLane = 0;
	static int[] sprobabilityLane = {sprobabilityXPLane, sprobabilityXNLane, sprobabilityYPLane, sprobabilityYNLane};
	
	static int sprobabilityXPDest = 75;
	static int sprobabilityXNDest = 50;
	static int sprobabilityYPDest = 25;
	static int sprobabilityYNDest = 0;
	static int[] sprobabilityDest = {sprobabilityXPDest, sprobabilityXNDest, sprobabilityYPDest, sprobabilityYNDest};
	
	public static void setProbabilityLane(int probabilityXPLocation, int probabilityXNLocation,int probabilityYPLocation,int probabilityYNLocation) {
		sprobabilityXPLane = probabilityXPLocation;
		sprobabilityXNLane = probabilityXNLocation;
		sprobabilityYPLane = probabilityYPLocation;
		sprobabilityYNLane = probabilityYNLocation;
	}
	
	public static void setProbabilityDest(int probabilityXPDest, int probabilityXNDest,int probabilityYPDest,int probabilityYNDest) {
		sprobabilityXPDest = probabilityXPDest;
		sprobabilityXNDest = probabilityXNDest;
		sprobabilityYPDest = probabilityYPDest;
		sprobabilityYNDest = probabilityYNDest;
	}
	
	
	
	
	public static void generateLane(Crossing c, Car car) {
		
		
		Arrays.sort(sprobabilityLane);
		
		Random myRandom=new Random();  
		final int ran = myRandom.nextInt(100);
		int ranLaneXP = myRandom.nextInt(c.getStreetXP().getLanes().size());
		int ranLaneXN = myRandom.nextInt(c.getStreetXP().getLanes().size());
		int ranLaneYP = myRandom.nextInt(c.getStreetXP().getLanes().size());
		int ranLaneYN = myRandom.nextInt(c.getStreetXP().getLanes().size());
		
		if(ranLaneXP == 0) {
			ranLaneXP++;
		}else if(ranLaneXN == 0) {
			ranLaneXN++;
		}else if(ranLaneYP == 0) {
			ranLaneYP++;
		}else if(ranLaneYN == 0) {
			ranLaneYN++;
		}
		
	
		if (ran >= sprobabilityLane[3]) { 
		
			if(sprobabilityLane[3] ==sprobabilityXPLane) {
				car.setLane(c.getStreetXP().getLanes().get(ranLaneXP));
				car.setStreet(c.getStreetXP());
			}else if(sprobabilityLane[3] ==sprobabilityXNLane) {
				car.setLane(c.getStreetXN().getLanes().get(ranLaneXN));
				car.setStreet(c.getStreetXN());
			}else if(sprobabilityLane[3] ==sprobabilityYPLane) {
				car.setLane(c.getStreetYP().getLanes().get(ranLaneYP));
				car.setStreet(c.getStreetYP());
			}else {
				car.setLane(c.getStreetYN().getLanes().get(ranLaneYN));
				car.setStreet(c.getStreetYN());
			}
			
			
		}
		else if (ran >= sprobabilityLane[2]) { 
			if(sprobabilityLane[2] ==sprobabilityXPLane) {
				car.setLane(c.getStreetXP().getLanes().get(ranLaneXP));
				car.setStreet(c.getStreetXP());
			}else if(sprobabilityLane[2] ==sprobabilityXNLane) {
				car.setLane(c.getStreetXN().getLanes().get(ranLaneXN));
				car.setStreet(c.getStreetXN());
			}else if(sprobabilityLane[2] ==sprobabilityYPLane) {
				car.setLane(c.getStreetYP().getLanes().get(ranLaneYP));
				car.setStreet(c.getStreetYP());
			}else {
				car.setLane(c.getStreetYN().getLanes().get(ranLaneYN));
				car.setStreet(c.getStreetYN());
			}
		} 
		else if (ran >= sprobabilityLane[1]) { 
			if(sprobabilityLane[1] ==sprobabilityXPLane) {
				car.setLane(c.getStreetXP().getLanes().get(ranLaneXP));
				car.setStreet(c.getStreetXP());
			}else if(sprobabilityLane[1] ==sprobabilityXNLane) {
				car.setLane(c.getStreetXN().getLanes().get(ranLaneXN));
				car.setStreet(c.getStreetXN());
			}else if(sprobabilityLane[1] ==sprobabilityYPLane) {
				car.setLane(c.getStreetYP().getLanes().get(ranLaneYP));
				car.setStreet(c.getStreetYP());
			}else {
				car.setLane(c.getStreetYN().getLanes().get(ranLaneYN));
				car.setStreet(c.getStreetYN());
			}
		} 
		else { 
			if(sprobabilityLane[0] >=sprobabilityXPLane) {
				car.setLane(c.getStreetXP().getLanes().get(ranLaneXP));
				car.setStreet(c.getStreetXP());
			}else if(sprobabilityLane[0] ==sprobabilityXNLane) {
				car.setLane(c.getStreetXN().getLanes().get(ranLaneXN));
				car.setStreet(c.getStreetXN());
			}else if(sprobabilityLane[0] ==sprobabilityYPLane) {
				car.setLane(c.getStreetYP().getLanes().get(ranLaneYP));
				car.setStreet(c.getStreetYP());
			}else {
				car.setLane(c.getStreetYN().getLanes().get(ranLaneYN));
				car.setStreet(c.getStreetYN());
			}
		}
		
	}
	
	
	
public static void generateDest(Crossing c, Car car) {
		
		
		Arrays.sort(sprobabilityDest);
		
		Random myRandom=new Random();  
		final int ran = myRandom.nextInt(100);
		final int ranDestXP = myRandom.nextInt(c.getStreetXP().getLanes().size());
		final int ranDestXN = myRandom.nextInt(c.getStreetXP().getLanes().size());
		final int ranDestYP = myRandom.nextInt(c.getStreetXP().getLanes().size());
		final int ranDestYN = myRandom.nextInt(c.getStreetXP().getLanes().size());
		//System.out.println(ranDestXP + "," + ranDestXN + "," + ranDestYP + "," + ranDestYN);
	
		if (ran >= sprobabilityDest[3]) { 
		
			if(sprobabilityDest[3] ==sprobabilityXPDest) {
				car.setdest(c.getStreetXP());
				
				
			}else if(sprobabilityDest[3] ==sprobabilityXNDest) {
				car.setdest(c.getStreetXN());
				
				
			}else if(sprobabilityDest[3] ==sprobabilityYPDest) {
				car.setdest(c.getStreetYP());
				
			
			}else {
				car.setdest(c.getStreetYN());
				
				
			}
			
			
		}
		else if (ran >= sprobabilityDest[2]) { 
			if(sprobabilityDest[2] ==sprobabilityXPDest) {
				car.setdest(c.getStreetXP());
				
				
			}else if(sprobabilityDest[2] ==sprobabilityXNDest) {
				car.setdest(c.getStreetXN());
				
			}else if(sprobabilityDest[2] ==sprobabilityYPDest) {
				car.setdest(c.getStreetYP());
				
				
			}else {
				car.setdest(c.getStreetYN());
				
				
			}
		} 
		else if (ran >= sprobabilityDest[1]) { 
			if(sprobabilityDest[1] ==sprobabilityXPDest) {
				car.setdest(c.getStreetXP());
				
				
			}else if(sprobabilityDest[1] ==sprobabilityXNDest) {
				car.setdest(c.getStreetXN());
			
				
			}else if(sprobabilityDest[1] ==sprobabilityYPDest) {
				car.setdest(c.getStreetYP());
				
				
			}else {
				car.setdest(c.getStreetYN());
			
			
			}
		} 
		else { 
			if(sprobabilityDest[0] >=sprobabilityXPDest) {
				car.setdest(c.getStreetXP());
			
			
			}else if(sprobabilityDest[0] ==sprobabilityXNDest) {
				car.setdest(c.getStreetXN());
			
			
			}else if(sprobabilityDest[0] ==sprobabilityYPDest) {
				car.setdest(c.getStreetYP());
			
			
			}else {
				car.setdest(c.getStreetYN());
			
			
			}
		}
		
	}
}
