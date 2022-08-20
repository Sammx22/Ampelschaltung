package de.sammx22.ampelschaltung.modells.directions;

public class Direction {
	private boolean rightTurnTrafficLight;
	private String dir;
	
	public Direction(String dir) {
		this.dir = dir;
	}
	public Direction(String dir,boolean rightTurnTrafficLight) {
		this.dir = dir;
		this.rightTurnTrafficLight = rightTurnTrafficLight;
	}
	
	public boolean getRightTurnTrafficLight() {
		return rightTurnTrafficLight;	
	}
	public String getDirection() {
		return dir;
	}
}
