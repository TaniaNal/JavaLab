package Birds;

import enums.DepartingBirds;

public abstract class Bird {

    private DepartingBirds departingBirds;

    @Override
    public String toString() {
        return "Bird{" +
                "departingBirds=" + departingBirds +
                ", weight=" + weight +
                '}';
    }

    public Bird(final DepartingBirds departingBirds, final int weight) {
        setWeight(weight);
        setDepartingBirds(departingBirds);
    }

    public final DepartingBirds getDepartingBirds() {
        return departingBirds;
    }

    public final void setDepartingBirds(final DepartingBirds departingBirds) {
        this.departingBirds = departingBirds;
    }

//    public static Object getBird() {
//        // TODO Auto-generated method stub
//        return null;
//    }
    private int weight;

    public final int getWeight() {
        return weight;
    }

    public final void setWeight(final int weight) {
        this.weight = weight;
    }

}
