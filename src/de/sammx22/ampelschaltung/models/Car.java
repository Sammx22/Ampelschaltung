package de.sammx22.ampelschaltung.models;

public class Car {
	
	
	private Street dest;
	private Street street;
	private Lane lane;
	
	public Car() {	
		
	}
	
	public Car(Street dest) {
		this.dest = dest;
		
	}
	
	public void setdest(Street dest){
		this.dest = dest;
	}
	public Street getdest(){
		return dest;
	}
	
	public void setStreet(Street street){
		this.street = street;
	}
	public Street getStreet(){
		return street;
	}
	
	public void setLane(Lane lane) {
		this.lane = lane;
	}
	public Lane getLane() {
		return lane;
	}
	
}
