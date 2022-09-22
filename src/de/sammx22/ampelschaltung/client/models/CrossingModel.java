package de.sammx22.ampelschaltung.client.models;

import java.awt.Color;

import sas.*;

public class CrossingModel {
	
	private Sprite s = new Sprite();
	private Rectangle y = new Rectangle(760, 10, 400, 1000);
	private Rectangle x = new Rectangle(461, 310, 1000, 400);
	
	private Rectangle yp1 = new Rectangle(860, 20, 5, 280,Color.white);
	private Rectangle yp2 = new Rectangle(960, 20, 5, 280,Color.white);
	private Rectangle yp3 = new Rectangle(1060, 20, 5, 280,Color.green);
	
	private Rectangle yn1 = new Rectangle(860, 720, 5, 280,Color.green);
	private Rectangle yn2 = new Rectangle(960, 720, 5, 280,Color.white);
	private Rectangle yn3 = new Rectangle(1060, 720, 5, 280,Color.white);
	
	private Rectangle xn1 = new Rectangle(471, 410, 280, 5,Color.green);
	private Rectangle xn2 = new Rectangle(471, 510, 280, 5,Color.white);
	private Rectangle xn3 = new Rectangle(471, 610, 280, 5,Color.white);
	
	private Rectangle xp1 = new Rectangle(1171, 410, 280, 5,Color.white);
	private Rectangle xp2 = new Rectangle(1171, 510, 280, 5,Color.white);
	private Rectangle xp3 = new Rectangle(1171, 610, 280, 5,Color.green);
	
	private Rectangle squareWhite = new Rectangle(760, 310, 400, 400,Color.white);
	private Rectangle squareBlack = new Rectangle(765, 315, 390, 390);
	
	public CrossingModel() {
		
		
		s.add(x);
		s.add(y);
		s.add(yp1);
		s.add(yp2);
		s.add(yp3);
		s.add(yn1);
		s.add(yn2);
		s.add(yn3);
		s.add(xp1);
		s.add(xp2);
		s.add(xp3);
		s.add(xn1);
		s.add(xn2);
		s.add(xn3);
		s.add(squareWhite);
		s.add(squareBlack);
		
	}
	public Sprite getSprite() {
		return s;
	}
	
}
