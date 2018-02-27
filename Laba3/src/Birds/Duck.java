package Birds;

import enums.DepartingBirds;

public class Duck extends Bird {

	private int speedOfFlight;
	public Duck(String departing, int speedOfFlight, int weight) {
		super(DepartingBirds.FLYAWAY, weight);
		this.speedOfFlight = speedOfFlight;
	}

	
	

	public Duck(String departing, DepartingBirds departingBirds, int weight) {
		super(departingBirds, weight);
	}

	public int getSpeedOfFlight() {
		return speedOfFlight;
	}

	public void setSpeedOfFlight(int speedOfFlight) {
		this.speedOfFlight = speedOfFlight;
	}
	@Override
	public String toString() {
		return "Duck [speedOfFlight=" + speedOfFlight + ",  Departing=" +getDepartingBirds() +", Weight=" + getWeight()+  "]";
	}

}