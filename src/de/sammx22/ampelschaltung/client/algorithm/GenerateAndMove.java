package de.sammx22.ampelschaltung.client.algorithm;

import sas.*;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

import de.sammx22.ampelschaltung.api.algorithm.FindWayAtCrossing;
import de.sammx22.ampelschaltung.api.algorithm.GenerateCars;
import de.sammx22.ampelschaltung.api.models.Car;
import de.sammx22.ampelschaltung.api.models.Crossing;
import de.sammx22.ampelschaltung.api.models.Lane;
import de.sammx22.ampelschaltung.api.models.Street;
import de.sammx22.ampelschaltung.api.models.directions.Direction;
import de.sammx22.ampelschaltung.client.models.CarModel;
import de.sammx22.ampelschaltung.client.models.TrafficLightModel;

public class GenerateAndMove {
	public static Car generateCar(Crossing c, CarModel carM) {
		Car car = new Car();
		GenerateCars.generateLane(c, car);
		GenerateCars.generateDest(c, car);
		int startLaneIndex = car.getLane().getIndex();
		if(startLaneIndex==0) {
			startLaneIndex++;
		}
		int destIndex;
		boolean green;
		
		
		
		if(!car.getAtLine()) {
		switch(car.getStreet().getOrientation()) {
		case "YP":
			
			
			
			switch(car.getLane().getIndex()) {
			
			case(2):
				
				carM.getCar().move(-100, 0);
				
				break;
			case(3):
				
					carM.getCar().move(-200, 0);
			
				break;
			}
			
			FindWayAtCrossing.changeLaneAtCrossing(car);
			
			destIndex=car.getLane().getIndex();
			 
			
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(destIndex>=startLaneIndex) {
			
			switch(destIndex-startLaneIndex) {
			
				
			case(0):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(0,1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(1):
				for(int i = 0; i<100; i++) {
				carM.getCar().move(-1, 1.3);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				break;
			case(2):
				for(int i = 0; i<200; i++) {
					carM.getCar().move(-1, 0.65);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			}
			
			//forward
			//carM.getCar().move(0, 130);
			}else {
				switch(startLaneIndex-destIndex) {
				
				case(0):
					for(int i = 0; i<130; i++) {
						carM.getCar().move(0,1);
						try {
							TimeUnit.MILLISECONDS.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				case(1):
					for(int i = 0; i<100; i++) {
					carM.getCar().move(1, 1.3);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
					break;
				case(2):
					for(int i = 0; i<200; i++) {
						carM.getCar().move(1, 0.65);
						try {
							TimeUnit.MILLISECONDS.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
				break;
						}
					
			}
			break;
		case "YN":
			
			carM.getCar().move(-100, 830);
			
			
			
			switch(car.getLane().getIndex()) {
			
			case(2):
				
				carM.getCar().move(100, 0);
				
				break;
			case(3):
				
					carM.getCar().move(200, 0);
			
				break;
			}
			FindWayAtCrossing.changeLaneAtCrossing(car);
			destIndex=car.getLane().getIndex();
			 
			
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(destIndex>=startLaneIndex) {
			
			switch(destIndex-startLaneIndex) {
			
			case(0):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(0,-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(1):
				for(int i = 0; i<100; i++) {
				carM.getCar().move(1, -1.3);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				break;
			case(2):
				for(int i = 0; i<200; i++) {
					carM.getCar().move(1, -0.65);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			}
			
			//forward
			//carM.getCar().move(0, 130);
			}else {
				switch(startLaneIndex-destIndex) {
				
				case(0):
					for(int i = 0; i<130; i++) {
						carM.getCar().move(0,-1);
						try {
							TimeUnit.MILLISECONDS.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				case(1):
					for(int i = 0; i<100; i++) {
					carM.getCar().move(-1, -1.3);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
					break;
				case(2):
					for(int i = 0; i<200; i++) {
						carM.getCar().move(-1, -0.65);
						try {
							TimeUnit.MILLISECONDS.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
						}}
			
			/*
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch(car.getLane().getIndex()) {
			case(1):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(0,-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(0):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(0,-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(2):
				for(int i = 0; i<100; i++) {
					carM.getCar().move(1, -1.3);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			case(3):
				for(int i = 0; i<200; i++) {
					carM.getCar().move(1, -0.65);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			}
			*/
			break;
			
		case "XP":
			
			carM.getCar().turn(90);
			carM.getCar().move(362.5, 470);
			
			switch(car.getLane().getIndex()) {
			
			case(2):
				
				carM.getCar().move(0,-100);
				
				break;
			case(3):
				
					carM.getCar().move(0,-200);
			
				break;
			}
			FindWayAtCrossing.changeLaneAtCrossing(car);
			destIndex=car.getLane().getIndex();
			
			
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(destIndex>=startLaneIndex) {
			
			switch(destIndex-startLaneIndex) {
			
				
			case(0):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(-1,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(1):
				for(int i = 0; i<100; i++) {
				carM.getCar().move(-1.3,-1);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				break;
			case(2):
				for(int i = 0; i<200; i++) {
					carM.getCar().move(-0.65,-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			}
			
			//forward
			//carM.getCar().move(0, 130);
			}else {
				switch(startLaneIndex-destIndex) {
				
				case(0):
					for(int i = 0; i<130; i++) {
						carM.getCar().move(-1,0);
						try {
							TimeUnit.MILLISECONDS.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				case(1):
					for(int i = 0; i<100; i++) {
					carM.getCar().move(-1.3,1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
					break;
				case(2):
					for(int i = 0; i<200; i++) {
						carM.getCar().move(-0.65,1);
						try {
							TimeUnit.MILLISECONDS.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
				break;
						}}
			
			
			
			
			
			/*
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch(car.getLane().getIndex()) {
			case(1):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(-1,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(0):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(-1,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(2):
				for(int i = 0; i<100; i++) {
					carM.getCar().move(-1.3, -1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			case(3):
				for(int i = 0; i<200; i++) {
					carM.getCar().move(-0.65, -1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
				
			}
			*/
			break;
		case "XN":
			
			carM.getCar().turn(90);
			carM.getCar().move(-465, 370);
			
			
			switch(car.getLane().getIndex()) {
			
			case(2):
				
				carM.getCar().move(0,100);
				
				break;
			case(3):
				
					carM.getCar().move(0,200);
			
				break;
			}
			FindWayAtCrossing.changeLaneAtCrossing(car);
			destIndex=car.getLane().getIndex();
	
			
			
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(destIndex>=startLaneIndex) {
			
			switch(destIndex-startLaneIndex) {
			
				
			case(0):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(1,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(1):
				for(int i = 0; i<100; i++) {
				carM.getCar().move(1.3,1);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				break;
			case(2):
				for(int i = 0; i<200; i++) {
					carM.getCar().move(0.65,1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			}
			
			//forward
			//carM.getCar().move(0, 130);
			}else {
				switch(startLaneIndex-destIndex) {
				
				case(0):
					for(int i = 0; i<130; i++) {
						carM.getCar().move(-1,0);
						try {
							TimeUnit.MILLISECONDS.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				case(1):
					for(int i = 0; i<100; i++) {
					carM.getCar().move(1.3,-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
					break;
				case(2):
					for(int i = 0; i<200; i++) {
						carM.getCar().move(0.65,-1);
						try {
							TimeUnit.MILLISECONDS.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
				break;
						}}
			
			
			/*
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch(car.getLane().getIndex()) {
			case(1):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(-1,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(0):
				for(int i = 0; i<130; i++) {
					carM.getCar().move(-1,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			case(2):
				for(int i = 0; i<100; i++) {
					carM.getCar().move(-1.3,1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			case(3):
				for(int i = 0; i<200; i++) {
					carM.getCar().move(-0.65,1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				break;
			}
			*/
			break;
		}
		
		car.setAtLine(true);
		}
		
		return car;
		
	}
	public static Crossing generateCrossing() {
		
		final String finalleft = "left";
		final String finalfront = "front";
		final String finalright = "right";
		final String finalback = "back";
		
		Direction left = new Direction(finalleft);
		Direction rightWithLight = new Direction(finalright,true);
		Direction right = new Direction(finalright);
		Direction front = new Direction(finalfront);
		Direction back = new Direction(finalback);
		
		Lane leftLaneXP = new Lane(left);
		Lane leftLaneXN = new Lane(left);
		Lane leftLaneYP = new Lane(left);
		Lane leftLaneYN = new Lane(left);
		Lane frontLaneXP = new Lane(front);
		Lane frontLaneXN = new Lane(front);
		Lane frontLaneYP = new Lane(front);
		Lane frontLaneYN = new Lane(front);
		Lane rightLaneXP = new Lane(rightWithLight);
		Lane rightLaneXN = new Lane(rightWithLight);
		Lane rightLaneYP = new Lane(right);
		Lane rightLaneYN = new Lane(right);
		Lane backLaneXP = new Lane(back);
		Lane backLaneXN = new Lane(back);
		Lane backLaneYP = new Lane(back);
		Lane backLaneYN = new Lane(back);
		
		Street streetXP = new Street("XP");
		streetXP.addLane(backLaneXP);
		streetXP.addLane(leftLaneXP);
		streetXP.addLane(frontLaneXP);
		streetXP.addLane(rightLaneXP);
		
		Street streetXN = new Street("XN");
		streetXN.addLane(backLaneXN);
		streetXN.addLane(leftLaneXN);
		streetXN.addLane(frontLaneXN);
		streetXN.addLane(rightLaneXN);
		Street streetYP = new Street("YP");
		streetYP.addLane(backLaneYP);
		streetYP.addLane(leftLaneYP);
		streetYP.addLane(frontLaneYP);
		streetYP.addLane(rightLaneYP);
		Street streetYN = new Street("YN");
		streetYN.addLane(backLaneYN);
		streetYN.addLane(leftLaneYN);
		streetYN.addLane(frontLaneYN);
		streetYN.addLane(rightLaneYN);
		
		Crossing c = new Crossing(streetXP, streetXN, streetYP, streetYN);
		return c;
	}
	
	
	
	public static void turnLeft(CarModel carM, Car car) {
	
		
		
		switch(car.getStreet().getOrientation()) {
		
		//xp
		case "XP":
			
			for(int i = 0; i<100; i++) {
			carM.getCar().move(-1.325, 0);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			for(int i = 0; i<90; i++) {
				carM.getCar().turn(-1);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			for(int i = 0; i<120; i++) {
				carM.getCar().move(0, 4);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				carM.getCar().setHidden(true);
			break;
		
		case "XN":
			for(int i = 0; i<100; i++) {
			carM.getCar().move(1.325, 0);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			for(int i = 0; i<90; i++) {
				carM.getCar().turn(-1);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			for(int i = 0; i<120; i++) {
				carM.getCar().move(0, -4);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				carM.getCar().setHidden(true);
			break;
		
		case "YN":
		//yn
		for(int i = 0; i<100; i++) {
			carM.getCar().move(0,-1.325);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			for(int i = 0; i<90; i++) {
				carM.getCar().turn(-1);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			for(int i = 0; i<120; i++) {
				carM.getCar().move(-4,0);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			carM.getCar().setHidden(true);
			break;
			
		case "YP":
			//yn
			for(int i = 0; i<100; i++) {
				carM.getCar().move(0,1.325);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				for(int i = 0; i<90; i++) {
					carM.getCar().turn(-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<120; i++) {
					carM.getCar().move(4,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				carM.getCar().setHidden(true);
				break;
		}
		FindWayAtCrossing.changeStreetAtCrossing(car, car.getdest());
	}
	public static void turnFront(CarModel carM, Car car) {
		
		
		
		switch(car.getStreet().getOrientation()) {
		
		//xp
		case "XP":
		for(int i = 0; i<100; i++) {
		carM.getCar().move(-4, -1);
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		for(int i = 0; i<120; i++) {
			carM.getCar().move(-4,0);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			carM.getCar().setHidden(true);
		break;
		
		case "XN":
			for(int i = 0; i<100; i++) {
			carM.getCar().move(4, 1);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			for(int i = 0; i<120; i++) {
				carM.getCar().move(4, 0);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				carM.getCar().setHidden(true);
			break;
		
		case "YN":
		//yn
		for(int i = 0; i<100; i++) {
			carM.getCar().move(1,-4);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			for(int i = 0; i<120; i++) {
				carM.getCar().move(0,-4);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			carM.getCar().setHidden(true);
			break;
			
		case "YP":
			//yn
			for(int i = 0; i<100; i++) {
				carM.getCar().move(-1,4);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
				for(int i = 0; i<120; i++) {
					carM.getCar().move(0,4);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				carM.getCar().setHidden(true);
				break;
		}
		FindWayAtCrossing.changeStreetAtCrossing(car, car.getdest());
	}
	public static void turnRight(CarModel carM, Car car) {
		
		
		
		switch(car.getStreet().getOrientation()) {
		
		//xp
		case "XP":
		for(int i = 0; i<100; i++) {
		carM.getCar().move(-1.325, 0);
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		for(int i = 0; i<90; i++) {
			carM.getCar().turn(1);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		for(int i = 0; i<120; i++) {
			carM.getCar().move(0, -4);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			carM.getCar().setHidden(true);
		break;
		
		case "XN":
			for(int i = 0; i<100; i++) {
			carM.getCar().move(1.325, 0);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			for(int i = 0; i<90; i++) {
				carM.getCar().turn(1);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			for(int i = 0; i<120; i++) {
				carM.getCar().move(0, 4);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				carM.getCar().setHidden(true);
			break;
		
		case "YN":
		//yn
		for(int i = 0; i<100; i++) {
			carM.getCar().move(0,-1.325);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			for(int i = 0; i<90; i++) {
				carM.getCar().turn(1);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			for(int i = 0; i<120; i++) {
				carM.getCar().move(4,0);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			carM.getCar().setHidden(true);
			break;
			
		case "YP":
			//yn
			for(int i = 0; i<100; i++) {
				carM.getCar().move(0,1.325);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				for(int i = 0; i<90; i++) {
					carM.getCar().turn(1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<120; i++) {
					carM.getCar().move(-4,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				carM.getCar().setHidden(true);
				break;
		}
		FindWayAtCrossing.changeStreetAtCrossing(car, car.getdest());
		
	}
	public static void turnBack(CarModel carM, Car car) {
		
		
		
		switch(car.getStreet().getOrientation()) {
		
		//xp
		case "XP":
		for(int i = 0; i<100; i++) {
		carM.getCar().move(-1.325, 0);
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		for(int i = 0; i<90; i++) {
			carM.getCar().turn(-1);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		for(int i = 0; i<100; i++) {
			carM.getCar().move(0, 1);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		for(int i = 0; i<90; i++) {
			carM.getCar().turn(-1);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		for(int i = 0; i<120; i++) {
			carM.getCar().move(4, 0);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
			carM.getCar().setHidden(true);
		break;
		
		case "XN":
			for(int i = 0; i<100; i++) {
				carM.getCar().move(1.325, 0);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				for(int i = 0; i<90; i++) {
					carM.getCar().turn(-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<100; i++) {
					carM.getCar().move(0, -1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<90; i++) {
					carM.getCar().turn(-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<120; i++) {
					carM.getCar().move(-4, 0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				carM.getCar().setHidden(true);
			break;
		
		case "YN":
		//yn
			for(int i = 0; i<100; i++) {
				carM.getCar().move(0,-1.325);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				for(int i = 0; i<90; i++) {
					carM.getCar().turn(-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<100; i++) {
					carM.getCar().move(-1,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<90; i++) {
					carM.getCar().turn(-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<120; i++) {
					carM.getCar().move(0,4);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
			carM.getCar().setHidden(true);
			break;
			
		case "YP":
			//yn
			for(int i = 0; i<100; i++) {
				carM.getCar().move(0,1.325);
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				for(int i = 0; i<90; i++) {
					carM.getCar().turn(-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<100; i++) {
					carM.getCar().move(1,0);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<90; i++) {
					carM.getCar().turn(-1);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				for(int i = 0; i<120; i++) {
					carM.getCar().move(0,-4);
					try {
						TimeUnit.MILLISECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				carM.getCar().setHidden(true);
				break;
		}
		FindWayAtCrossing.changeStreetAtCrossing(car, car.getdest());
	}

	public static void setTrafficLight(Crossing c,TrafficLightModel tLM) {
		
		if(c.getStreetXP().getLanes().get(2).getTrafficLight().get(0).getStatus() == "green") {
		tLM.getXP().setColor(Color.green);
		}else {
			tLM.getXP().setColor(Color.red);
		}
		if(c.getStreetXN().getLanes().get(2).getTrafficLight().get(0).getStatus() == "green") {
			tLM.getXN().setColor(Color.green);
			}else {
				tLM.getXN().setColor(Color.red);
			}
		if(c.getStreetYP().getLanes().get(2).getTrafficLight().get(0).getStatus() == "green") {
			tLM.getYP().setColor(Color.green);
			}else {
				tLM.getYP().setColor(Color.red);
			}
		if(c.getStreetYN().getLanes().get(2).getTrafficLight().get(0).getStatus() == "green") {
			tLM.getYN().setColor(Color.green);
			}else {
				tLM.getYN().setColor(Color.red);
			}
	}


}
