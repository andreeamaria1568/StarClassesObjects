package ro.ctrln.classes;

import java.math.BigDecimal;

public class Star {


    private String starDescription;
    private int diameter;
    private int satellites;
    private BigDecimal mass;
    private SmallPlanet smallPlanet;

    public Star() {
    }

    public Star(String starDescription, int diameter, int satellites, BigDecimal mass) {
        this.starDescription = starDescription;
        this.diameter = diameter;
        this.satellites = satellites;
        this.mass = mass;
    }

    public String getStarDescription() {
        return starDescription;
    }

    public void setStarDescription(String starDescription) {
        this.starDescription = starDescription;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSatellites() {
        return satellites;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }
}

    class SmallPlanet {
    private String planetName;
}