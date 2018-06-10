package ua.lviv.iot.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Bird {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bird_id")
    private int id;
    @Column(name = "bird_departingBirds")
    private String departingBirds;
    @Column(name = "bird_departingBirds")
    private int weight;

    public Bird() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartingBirds() {
        return departingBirds;
    }

    public void setDepartingBirds(String departingBirds) {
        this.departingBirds = departingBirds;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
