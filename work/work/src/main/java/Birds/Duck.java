package Birds;

import enums.DepartingBirds;

public class Duck extends Bird {

    private int speedOfFlight;

    public Duck(final String departing, final int speedOfFlight, final int weight) {
        super(DepartingBirds.FLYAWAY, weight);
        setSpeedOfFlight(speedOfFlight);
    }

    public final int getSpeedOfFlight() {
        return speedOfFlight;
    }

    public final void setSpeedOfFlight(final int speedOfFlight) {
        this.speedOfFlight = speedOfFlight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "speedOfFlight=" + getSpeedOfFlight() +
                '}';
    }
}
