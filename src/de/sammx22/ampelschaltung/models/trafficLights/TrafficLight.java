package de.sammx22.ampelschaltung.models.trafficLights;

public class TrafficLight {
	
	private String status;
	
	
	public TrafficLight() {
		
	}
	public TrafficLight(String status) {
		this.status = status;
	}
	
	
	public void setStatus(String status) {
		status = this.status;
	}
	public String getStatus() {
		return status;
	}

	@Override
	public String toString(){
		return "Status: "+status;
	}
}
