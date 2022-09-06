package de.sammx22.ampelschaltung.modells;

public class Car {
	
	
	private Street destination;
	private Lane lane;
	
	public Car() {	
		
	}
	
	public Car(Street destination) {
		this.destination = destination;
		
	}
	
	public void setDestination(Street destination){
		this.destination = destination;
	}
	public Street getDestination(){
		return destination;
	}
	public void setLane(Lane lane) {
		this.lane = lane;
	}
	public Lane getLane() {
		return lane;
	}
	
}
