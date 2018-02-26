package Birds;

import enums.DepartingBirds;

public class Stock extends Bird {

	private int leghtOfLegs;
	private String Weight;
	public Stock(String departing, int speedOfFlight, int leghtOfLegs) {
		super(DepartingBirds.STOCK);
		this.leghtOfLegs = leghtOfLegs;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public Stock(String departing, DepartingBirds departingBirds) {
		super(departingBirds);
	}

	public int getLeghtOfLegs() {
		return leghtOfLegs;
	}

	public void setLeghtOfLegs(int leghtOfLegs) {
		this.leghtOfLegs = leghtOfLegs;
	}
	@Override
	public String toString() {
		return "Stock";
	}
}

