package Birds;

import enums.DepartingBirds;

public class Sparrow extends Bird {

    private int lengthOfWings;

    public Sparrow(final String departing, final int leghtOfWings, final int weight) {
        super(DepartingBirds.DONOTFLYAWAY, weight);
        setLengthOfWings(leghtOfWings);
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
