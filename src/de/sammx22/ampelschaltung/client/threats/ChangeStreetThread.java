package de.sammx22.ampelschaltung.client.threats;


import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Crossing;
import de.sammx22.ampelschaltung.client.main.Main;
import de.sammx22.ampelschaltung.client.models.CarModel;

public class ChangeStreetThread  extends Thread{
	
	Crossing tc;
	CarModel tcarM;
	Car tcar;

	public ChangeStreetThread(Crossing tc,CarModel tcarM,Car tcar) {
		this.tc = tc;
		this.tcarM=tcarM;
		this.tcar = tcar;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(!interrupted()) {
			Main.changeStreet(tcarM, tcar,tc);
		 }
	}
}
