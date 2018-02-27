package Birds;

import enums.DepartingBirds;

public class Stock extends Bird {

	private int leghtOfLegs;
	public Stock(String departing, int speedOfFlight, int leghtOfLegs, int weight) {
		super(DepartingBirds.FLYAWAY, weight);
		this.leghtOfLegs = leghtOfLegs;
	}



	public Stock(String departing, DepartingBirds departingBirds, int weight) {
		super(departingBirds, weight);
	}

	public int getLeghtOfLegs() {
		return leghtOfLegs;
	}

	public void setLeghtOfLegs(int leghtOfLegs) {
		this.leghtOfLegs = leghtOfLegs;
	}
	@Override
	public String toString() {
		return "Stock [leghtOfLegs=" + leghtOfLegs + ", Departing=" +getDepartingBirds() +", Weight=" + getWeight()+ "]";
	}
}

