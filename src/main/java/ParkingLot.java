package main.java;

public class ParkingLot {
	
	private int maxSpots;
	private int takenSpots;
	
	public ParkingLot(int numOfSpots) {
		maxSpots = numOfSpots;
		takenSpots = 0;
	}
	
	public void parkCar() throws Exception {
		if (takenSpots == maxSpots) 
			throw new Exception("Can't park, lot full");
		takenSpots++;
	}
	
	public void unparkCar() throws Exception {
		if (takenSpots == 0) 
			throw new Exception("Sorry, your car is clearly not here");
		takenSpots--;
	}

	public int getMaxSpots() {
		return maxSpots;
	}

	public int getTakenSpots() {
		return takenSpots;
	}

}
