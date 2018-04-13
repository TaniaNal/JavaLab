package birds;

import enums.BirdType;

public class Stock extends Bird {

    private int leghtOfLegs;

    public Stock(final int speedOfFlight, final int leghtOfLegs, final int weight) {
        super(BirdType.STOCK, weight);
        setLeghtOfLegs(leghtOfLegs);
    }

    public final int getLeghtOfLegs() {
        return leghtOfLegs;
    }

    public final void setLeghtOfLegs(final int leghtOfLegs) {
        this.leghtOfLegs = leghtOfLegs;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()+"leghtOfLegs";
    }

    @Override
    public String toCSV() {
        return super.toCSV()+ getLeghtOfLegs();
    }
    @Override
    public String toString() {
        return "Stock{" +
                "leghtOfLegs=" + getLeghtOfLegs() +
                '}';
    }
}

