package Birds;

import enums.DepartingBirds;

public class Sparrow extends Bird {

	private int leghtOfWings;

	public Sparrow(String departing, int leghtOfWings, int weight) {
		super(DepartingBirds.DONOTFLYAWAY, weight);
		this.leghtOfWings = leghtOfWings;
	}

	

	public Sparrow(String departing, DepartingBirds departingBirds, int weight) {
		super(departingBirds, weight);
	}

	public int getLeghtOfWings() {
		return leghtOfWings;
	}

	public void setLeghtOfWings(int leghtOfWings) {
		this.leghtOfWings = leghtOfWings;
	}
	@Override
	public String toString() {
		return "Sparrow [leghtOfWings=" + leghtOfWings + ", Departing=" +getDepartingBirds() +", Weight=" + getWeight()+ "]";
	}

}