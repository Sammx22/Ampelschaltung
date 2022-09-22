package de.sammx22.ampelschaltung.api.models;

public class Car {
	
	
	private Street dest;
	private Street street;
	private Lane lane;
	private boolean atLine;
	
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
	
	public void setAtLine(boolean atLine){
		this.atLine = atLine;
	}
	public boolean getAtLine(){
		return atLine;
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
