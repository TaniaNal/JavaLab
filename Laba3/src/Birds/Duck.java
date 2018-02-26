package Birds;

import enums.DepartingBirds;

public class Duck extends Bird {

	private int speedOfFlight;
	private String Weight;
	public Duck(String departing, int speedOfFlight) {
		super(DepartingBirds.DUCK);
		this.speedOfFlight = speedOfFlight;
	}

	
	public String getWeight() {
		return Weight;
	}


	public void setWeight(String weight) {
		Weight = weight;
	}


	public Duck(String departing, DepartingBirds departingBirds) {
		super(departingBirds);
	}

	public int getSpeedOfFlight() {
		return speedOfFlight;
	}

	public void setSpeedOfFlight(int speedOfFlight) {
		this.speedOfFlight = speedOfFlight;
	}
	@Override
	public String toString() {
		return "Duck";
	}

}