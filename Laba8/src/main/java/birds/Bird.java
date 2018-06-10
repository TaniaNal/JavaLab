package birds;

import enums.BirdType;

public class Bird {

    private BirdType departingBirds;
    private int weight;
    private Integer id;

    public Bird() {
    }

    public Bird(final BirdType departingBirds, final int weight, final Integer id) {
        setWeight(weight);
        setDepartingBirds(departingBirds);
        setId(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "departingBirds=" + departingBirds +
                ", weight=" + weight +
                '}';
    }

    public final BirdType getDepartingBirds() {
        return departingBirds;
    }

    public final void setDepartingBirds(final BirdType departingBirds) {
        this.departingBirds = departingBirds;
    }

    public final int getWeight() {
        return weight;
    }

    public final void setWeight(final int weight) {
        this.weight = weight;
    }

    public String getHeaders(){
        return "departingBirds, weight";
    }
    public String toCSV() {
        return departingBirds+","+ getWeight();
    }
}
