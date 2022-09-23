package de.sammx22.ampelschaltung.client.models;

import java.awt.Color;

import sas.Circle;

public class TrafficLightModel {
	private Circle XP = new Circle(1131, 480, 30, Color.green);
	private Circle YP = new Circle(930, 280, 30, Color.red);
	private Circle XN = new Circle(731, 480, 30, Color.green);
	private Circle YN = new Circle(930, 680, 30, Color.red);
	
	public TrafficLightModel() {
		
	}
	public Circle getXP() {
		return XP;
		
	}
	public Circle getXN() {
		return XN;
		
	}
	public Circle getYP() {
		return YP;
		
	}
	public Circle getYN() {
		return YN;
		
	}
	
}
