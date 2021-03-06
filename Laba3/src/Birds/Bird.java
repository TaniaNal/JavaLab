package Birds;

import enums.DepartingBirds;

public abstract class Bird {

	private DepartingBirds departingBirds;

	@Override
	public String toString() {
		return "Bird [departingBirds=" + departingBirds + ", getDepartingBirds()=" + getDepartingBirds()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
		
	}

	public Bird(DepartingBirds departingBirds, int weight) {
		this.weight=weight;
		this.departingBirds = departingBirds;
	}

	public DepartingBirds getDepartingBirds() {
		return departingBirds;
	}

	public void setDepartingBirds(DepartingBirds departingBirds) {
		this.departingBirds = departingBirds;
	}

	public static Object getBird() {
		// TODO Auto-generated method stub
		return null;
	}
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


 
	
}