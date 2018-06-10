package ua.lviv.iot.model;


import ua.lviv.iot.model.Bird;

public class Duck extends Bird {

    private int speedOfFlight;



    public Duck(int i, int i1) {

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
