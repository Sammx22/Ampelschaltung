package de.sammx22.ampelschaltung.modells;

public class Crossing {
	
	String lanesx;
	String lanesy;
	Boolean leftTurnLane;
	Boolean rightTurnLane;
	
	public Crossing() {
		
	}
	
	public Crossing(String lanesx, String lanesy) {
		lanesx = this.lanesx;
		lanesy = this.lanesy;
	}
	public Crossing(String lanesx, String lanesy, Boolean leftTurnLane, Boolean rightTurnLane) {
		lanesx = this.lanesx;
		lanesy = this.lanesy;
		leftTurnLane = this.leftTurnLane;
		rightTurnLane = this.rightTurnLane;
	}
}
