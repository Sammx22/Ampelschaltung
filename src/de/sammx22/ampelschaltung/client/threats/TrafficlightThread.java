package de.sammx22.ampelschaltung.client.threats;

import java.util.concurrent.TimeUnit;

import de.sammx22.ampelschaltung.api.algorithm.ChangeTrafficLight;
import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Crossing;
import de.sammx22.ampelschaltung.client.algorithm.GenerateAndMove;

import de.sammx22.ampelschaltung.client.models.TrafficLightModel;

public class TrafficlightThread extends Thread{

	
	TrafficLightModel ttLM;
	Crossing tc;


	public TrafficlightThread(TrafficLightModel ttLM,Crossing tc) {
		this.ttLM = ttLM;
		this.tc = tc;

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("run");
			ChangeTrafficLight.toggleTrafficLightsXY(tc);
			GenerateAndMove.setTrafficLight(tc, ttLM);
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
	}
}
