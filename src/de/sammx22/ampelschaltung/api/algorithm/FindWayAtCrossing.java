package de.sammx22.ampelschaltung.api.algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Lane;
import de.sammx22.ampelschaltung.api.models.Street;

public class FindWayAtCrossing {
	private static void changeLane1(Lane destination, Car car) {
		//System.out.println("test"+ destination.getDirection().get(0).getDirection());
		car.getLane().removeCar(car);
		destination.addCar(car, destination);
		
	}
	private static void changeLane(Lane destination, Car car) {
		//System.out.println("test"+car.getLane().getDirection().toString());
		int size = car.getStreet().getLanes().size();
		int laneIndex = car.getLane().getIndex();
		int destIndex = destination.getIndex();
		//System.out.println("laneIndex"+laneIndex);
		//System.out.println("destIndex"+destIndex);
		if(laneIndex<destIndex) {
			//System.out.println("p");
		for(int i = laneIndex+1; i<=destIndex;i++) {
			
			changeLane1(car.getStreet().getLanes().get(i),car);
			//System.out.println("dirp"+car.getLane().getIndex());
		}
		}else if(laneIndex>destIndex) {
			//System.out.println("n");
			for(int i = laneIndex-1; i>=destIndex;i--) {
				
				changeLane1(car.getStreet().getLanes().get(i),car);
				//System.out.println("dirn"+car.getLane().getIndex());
				
			}
		}else {
			//System.out.println("e");
			
			changeLane1(car.getStreet().getLanes().get(laneIndex),car);
			//System.out.println("dirn"+car.getLane().getIndex());
		}
	}	
	public static void changeLaneAtCrossing(Car car) {
		Random rn = new Random();
		List<Integer> lanes = new ArrayList<Integer>();
		
		
		
		if(car.getStreet().getOrientation()=="XP") {
			switch(car.getdest().getOrientation()) {
			case "XP":
				//turn
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					
						if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "left") {
							changeLane(car.getStreet().getLanes().get(i), car);
						
				
					
						}
					}
				break;
			case "XN":
				//front
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "front") {
						changeLane(car.getStreet().getLanes().get(i), car);
					}
			
					}
				break;
			case "YP":
				//right
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "right") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
					
						}
					}
				break;
			case "YN":
				//left
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "left") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
					
						}
					}
				break;
			}
		}else if(car.getStreet().getOrientation()=="XN") {
			switch(car.getdest().getOrientation()) {
				case "XP":
					//front
					for(int i=0; i< car.getStreet().getLanes().size(); i++) {
						if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "front") {
							changeLane(car.getStreet().getLanes().get(i), car);
						
				
						
							}
						}
					break;
				case "XN":
					//turn
					for(int i=0; i< car.getStreet().getLanes().size(); i++) {
						if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "left") {
							changeLane(car.getStreet().getLanes().get(i), car);
						
				
						
							}
						}
					break;
				case "YP":
					//left
					for(int i=0; i< car.getStreet().getLanes().size(); i++) {
						if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "left") {
							changeLane(car.getStreet().getLanes().get(i), car);
						
				
						
							}
						}
					break;
				case "YN":
					//right
					for(int i=0; i< car.getStreet().getLanes().size(); i++) {
						if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "right") {
							changeLane(car.getStreet().getLanes().get(i), car);
						
				
						
							}
						}
					break;
				}
		}else if(car.getStreet().getOrientation()=="YP") {
			switch(car.getdest().getOrientation()) {
			case "XP":
				//left
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "left") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
					
						}
					}
				break;
			case "XN":
				//right
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "right") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
					
						}
					}
				break;
			case "YP":
				//turn
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "left") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
					
						}
					}
				break;
			case "YN":
				//front
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "front") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
						}
					}
				break;
			}
		}else if(car.getStreet().getOrientation()=="YN") {
			switch(car.getdest().getOrientation()) {
			case "XP":
				//right
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "right") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
					
						}
					}
				break;
			case "XN":
				//left
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "left") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
					
						}
					}
				break;
			case "YP":
				//front
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "front") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
					
						}
					}
				break;
			case "YN":
				//turn
				for(int i=0; i< car.getStreet().getLanes().size(); i++) {
					if(car.getStreet().getLanes().get(i).getDirection().get(0).getDirection() == "left") {
						changeLane(car.getStreet().getLanes().get(i), car);
					
			
						}
					}
				break;
			}
	}	
		
		
		
		
	}
	
	public static boolean changeStreetAtCrossing(Car car, Street destination) {
		
		if(car.getLane().getTrafficLight().get(0).getStatus()=="green") {
			
			
		car.setStreet(destination);
		return true;
		}else if(car.getLane().getTrafficLight().get(0).getStatus()=="red") {
		
			return false;
		}
		return false;
	}
	
}
