package ua.lviv.iot.model;


public class Stock extends Bird {

    private int leghtOfLegs;



    public Stock(int i, int i1, int i2) {

    }

    public final int getLeghtOfLegs() {
        return leghtOfLegs;
    }

    public final void setLeghtOfLegs(final int leghtOfLegs) {
        this.leghtOfLegs = leghtOfLegs;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "leghtOfLegs=" + getLeghtOfLegs() +
                '}';
    }
}

