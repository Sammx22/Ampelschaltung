package de.sammx22.ampelschaltung.modells;

import java.util.ArrayList;
import java.util.List;

public class Street {
	Lane o;
	Lane t;
	
	List<Lane> lanes = new ArrayList<Lane>();
	
	
	public Street() {
		
	}
	public void addLane(Lane lane) {
		
		lanes.add(lane);
	}
	public List<Lane> getLanes() {
		return lanes;
	}
	
	@Override
	public String toString(){
		return lanes.toString();
	}
}
