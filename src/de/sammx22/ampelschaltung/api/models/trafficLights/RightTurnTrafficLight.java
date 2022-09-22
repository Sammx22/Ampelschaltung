package de.sammx22.ampelschaltung.api.models.trafficLights;

public class RightTurnTrafficLight extends TrafficLight{
private String status;
	
	
	public RightTurnTrafficLight() {
		
	}
	public RightTurnTrafficLight(String status) {
		this.status = status;
	}
	
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	
	

	@Override
	public String toString(){
		return "Status: "+status;
	}
}

