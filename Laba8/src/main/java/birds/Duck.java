package birds;

import enums.BirdType;

public class Duck extends Bird {

    private int speedOfFlight;

    public Duck(final int speedOfFlight, final int weight, final Integer id) {
        super(BirdType.DUCK, weight, id);
        setSpeedOfFlight(speedOfFlight);
    }

    public Duck(int i, int i1) {

    }

    public final int getSpeedOfFlight() {
        return speedOfFlight;
    }

    public final void setSpeedOfFlight(final int speedOfFlight) {
        this.speedOfFlight = speedOfFlight;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()+"speedOfFlight";
    }

    @Override
    public String toCSV() {
        return super.toCSV()+ getSpeedOfFlight();
    }
    @Override
    public String toString() {
        return "Duck{" +
                "speedOfFlight=" + getSpeedOfFlight() +
                '}';
    }
}
