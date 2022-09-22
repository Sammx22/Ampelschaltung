package de.sammx22.ampelschaltung.client.models;

import java.awt.Color;

import sas.Rectangle;
import sas.Sprite;

public class CarModel {

	
	private Rectangle car = new Rectangle(972.5, 20, 80, 150,Color.red);
	public CarModel() {
		
	}
	public Rectangle getCar() {
		return car;
		
	}
	
}
