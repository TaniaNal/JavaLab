package Birds;

import enums.DepartingBirds;

public class Sparrow extends Bird {

	private int leghtOfWings;
	private String Weight;
	public Sparrow(String departing, int leghtOfWings) {
		super(DepartingBirds.SPARROW);
		this.leghtOfWings = leghtOfWings;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public Sparrow(String departing, DepartingBirds departingBirds) {
		super(departingBirds);
	}

	public int getLeghtOfWings() {
		return leghtOfWings;
	}

	public void setLeghtOfWings(int leghtOfWings) {
		this.leghtOfWings = leghtOfWings;
	}
	@Override
	public String toString() {
		return "Sparrow";
	}

}