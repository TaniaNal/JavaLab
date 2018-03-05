package Birds;

import enums.DepartingBirds;

public class Stock extends Bird {

    private int leghtOfLegs;
    public Stock(final String departing, final int speedOfFlight, final int leghtOfLegs, final int weight) {
        super(DepartingBirds.FLYAWAY, weight);
        this.leghtOfLegs = leghtOfLegs;
    }



    public Stock(final String departing, final DepartingBirds departingBirds, final int weight) {
        super(departingBirds, weight);
    }

    public final int getLeghtOfLegs() {
        return leghtOfLegs;
    }

    public final void setLeghtOfLegs(final int leghtOfLegs) {
        this.leghtOfLegs = leghtOfLegs;
    }
    @Override
    public String toString() {
        return "Stock [leghtOfLegs=" + leghtOfLegs + ", Departing=" + getDepartingBirds() + ", Weight=" + getWeight() + "]";
    }
}

