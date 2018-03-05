package Birds;

import enums.DepartingBirds;

public class Sparrow extends Bird {

    private int leghtOfWings;

    public Sparrow(final String departing, final int leghtOfWings, final int weight) {
        super(DepartingBirds.DONOTFLYAWAY, weight);
        this.leghtOfWings = leghtOfWings;
    }



    public Sparrow(final String departing, final DepartingBirds departingBirds, final int weight) {
        super(departingBirds, weight);
    }

    public final int getLeghtOfWings() {
        return leghtOfWings;
    }

    public final void setLeghtOfWings(final int leghtOfWings) {
        this.leghtOfWings = leghtOfWings;
    }
    @Override
    public String toString() {
        return "Sparrow [leghtOfWings=" + leghtOfWings + ", Departing=" + getDepartingBirds() + ", Weight=" + getWeight()
                + "]";
    }

}
