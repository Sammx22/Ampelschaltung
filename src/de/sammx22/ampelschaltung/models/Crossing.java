package de.sammx22.ampelschaltung.models;

public class Crossing {
	
	private Street streetxp;
	private Street streetxn;
	private Street streetyp;
	private Street streetyn;
	
	public Crossing() {
		
	}
	
	public Crossing(Street streetxp, Street streetxn, Street streetyp, Street streetyn) {
		this.streetxp = streetxp;
		this.streetxn = streetxn;
		this.streetyp = streetyp;
		this.streetyn = streetyn;
	}
	
	public Street getStreetXP() {
		return streetxp;
	}
	
	public Street getStreetXN() {
		return streetxn;
	}
	
	public Street getStreetYP() {
		return streetyp;
	}
	
	public Street getStreetYN() {
		return streetyn;
	}
	
	@Override
	public String toString(){
		return streetxp.toString() + streetxn.toString() + streetyp.toString() + streetyn.toString();
	}
	
}
