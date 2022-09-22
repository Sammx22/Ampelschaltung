package de.sammx22.ampelschaltung.api.models;

import java.util.ArrayList;
import java.util.List;

import de.sammx22.ampelschaltung.api.models.directions.Direction;
import de.sammx22.ampelschaltung.api.models.trafficLights.RightTurnTrafficLight;
import de.sammx22.ampelschaltung.api.models.trafficLights.TrafficLight;

public class Lane{
	
	private List<TrafficLight> trafficlight = new ArrayList<TrafficLight>();
	private List<Direction> dir = new ArrayList<Direction>();
	private List<Car> cars = new ArrayList<Car>();
	private TrafficLight trafficLight = new TrafficLight("red");
	private RightTurnTrafficLight rightTurnTrafficLight = new RightTurnTrafficLight("green");
	private int index;
	public Lane() {
		
	}
	public Lane(Direction dir) {
		
		this.dir.add(dir);
		
		if(dir.getRightTurnTrafficLight()) {
			this.trafficlight.add(rightTurnTrafficLight);
		}else {
			this.trafficlight.add(trafficLight);
		}
		
		
	}
	public Lane(Direction dir1, Direction dir2) {
		
		this.dir.add(dir1);
		this.dir.add(dir2);

		//if there are two same Directions
		if(dir1.getDirection()!= dir2.getDirection()) {
			if(dir1.getRightTurnTrafficLight()) {
				trafficlight.add(rightTurnTrafficLight);
				System.out.println("r");
			}else {
				trafficlight.add(trafficLight);
			}
			if(dir2.getRightTurnTrafficLight()) {
				trafficlight.add(rightTurnTrafficLight);
				System.out.println("r");
			}else {
				trafficlight.add(trafficLight);
			}
		}else {
			if(dir1.getRightTurnTrafficLight()) {
				trafficlight.add(rightTurnTrafficLight);
				System.out.println("r");
			}else {
				trafficlight.add(trafficLight);
			}
		}
		
	}
	public Lane(Direction dir1, Direction dir2, Direction dir3) {
		
		this.dir.add(dir1);
		this.dir.add(dir2);
		this.dir.add(dir3);
	
		//if there are two or three same Directions
				if(dir1.getDirection()!= dir2.getDirection() && dir1.getDirection()!= dir3.getDirection() && dir2.getDirection()!= dir3.getDirection()) {
					if(dir1.getRightTurnTrafficLight()) {
						trafficlight.add(rightTurnTrafficLight);
					}else {
						trafficlight.add(trafficLight);
					}
					if(dir2.getRightTurnTrafficLight()) {
						trafficlight.add(rightTurnTrafficLight);
					}else {
						trafficlight.add(trafficLight);
					}
				}else {
					
					if(dir1.getDirection()!= dir2.getDirection()) {
						if(dir1.getRightTurnTrafficLight()) {
							trafficlight.add(rightTurnTrafficLight);
						}else {
							trafficlight.add(trafficLight);
						}
						if(dir2.getRightTurnTrafficLight()) {
							trafficlight.add(rightTurnTrafficLight);
						}else {
							trafficlight.add(trafficLight);
						}
					}else if(dir1.getDirection()!= dir3.getDirection()){
						if(dir1.getRightTurnTrafficLight()) {
							trafficlight.add(rightTurnTrafficLight);
						}else {
							trafficlight.add(trafficLight);
						}
						if(dir3.getRightTurnTrafficLight()) {
							trafficlight.add(rightTurnTrafficLight);
						}else {
							trafficlight.add(trafficLight);
						}
					}else if(dir2.getDirection()!= dir3.getDirection()){
						if(dir2.getRightTurnTrafficLight()) {
							trafficlight.add(rightTurnTrafficLight);
						}else {
							trafficlight.add(trafficLight);
						}
						if(dir3.getRightTurnTrafficLight()) {
							trafficlight.add(rightTurnTrafficLight);
						}else {
							trafficlight.add(trafficLight);
						}
					}
					
					
				}
	}
	
	
	public List<TrafficLight> getTrafficLight() {
	return trafficlight;	
	}
	public List<Direction> getDirection() {
	return dir;
	}
	public void addCar(Car car, Lane destination) {
		cars.add(car);
		car.setLane(destination);
	}
	public List<Car> getCars(){
		return cars;
	}
	public void removeCar(Car car) {
		cars.remove(car);
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
	
	
}
