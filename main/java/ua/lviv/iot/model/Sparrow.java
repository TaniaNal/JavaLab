package ua.lviv.iot.model;

public class Sparrow extends Bird {

    private int lengthOfWings;

    public Sparrow(final int leghtOfWings, final int weight, final Integer id) {

    }

    public Sparrow(int i, int i1) {
    }

    public final int getLengthOfWings() {
        return lengthOfWings;
    }

    public final void setLengthOfWings(final int lengthOfWings) {
        this.lengthOfWings = lengthOfWings;
    }



    @Override
    public String toString() {
        return "Sparrow{" +
                "lengthOfWings=" + getLengthOfWings() +
                '}';
    }
}
