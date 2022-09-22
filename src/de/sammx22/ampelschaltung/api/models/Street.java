package de.sammx22.ampelschaltung.api.models;

import java.util.ArrayList;
import java.util.List;

public class Street {
	private String orientation;

	
	List<Lane> lanes = new ArrayList<Lane>();
	
	
	
	public Street(String orientation) {
		this.orientation = orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public String getOrientation() {
		return orientation;
	}
	
	public void addLane(Lane lane) {
		//System.out.println("Index"+lanes.size());
		lane.setIndex(lanes.size());
		lanes.add(lane);
		
	}
	public List<Lane> getLanes() {
		return lanes;
	}
	
	public int laneSize() {
		return lanes.size();
	}
	
	@Override
	public String toString(){
		return lanes.toString();
	}
}
