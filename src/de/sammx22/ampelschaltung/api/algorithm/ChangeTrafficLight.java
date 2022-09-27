package de.sammx22.ampelschaltung.api.algorithm;

import de.sammx22.ampelschaltung.api.models.Crossing;

public class ChangeTrafficLight {
	
	public static void toggleTrafficLightsXY(Crossing c) {
		
		if(c.getStreetXP().getLanes().get(0).getTrafficLight().get(0).getStatus() == "green") {
			
			for(int i = 0; i<c.getStreetXP().getLanes().size(); i++) {
				c.getStreetXP().getLanes().get(i).getTrafficLight().get(0).setStatus("red");
			}
			for(int i = 0; i<c.getStreetXN().getLanes().size(); i++) {
				c.getStreetXN().getLanes().get(i).getTrafficLight().get(0).setStatus("red");
			}
			for(int i = 0; i<c.getStreetYP().getLanes().size(); i++) {
				c.getStreetYP().getLanes().get(i).getTrafficLight().get(0).setStatus("green");
			}
			for(int i = 0; i<c.getStreetYN().getLanes().size(); i++) {
				c.getStreetYN().getLanes().get(i).getTrafficLight().get(0).setStatus("green");
			}
		}else {
	
			for(int i = 0; i<c.getStreetXP().getLanes().size(); i++) {
				c.getStreetXP().getLanes().get(i).getTrafficLight().get(0).setStatus("green");
			}
			for(int i = 0; i<c.getStreetXN().getLanes().size(); i++) {
				c.getStreetXN().getLanes().get(i).getTrafficLight().get(0).setStatus("green");
			}
			for(int i = 0; i<c.getStreetYP().getLanes().size(); i++) {
				c.getStreetYP().getLanes().get(i).getTrafficLight().get(0).setStatus("red");
			}
			for(int i = 0; i<c.getStreetYN().getLanes().size(); i++) {
				c.getStreetYN().getLanes().get(i).getTrafficLight().get(0).setStatus("red");
			}
		}
	}
}
