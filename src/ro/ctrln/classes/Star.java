package ro.ctrln.classes;

import java.math.BigDecimal;
import java.util.Objects;

public class Star {


    private String starDescription; //variabila de instanta toate 5
    private int diameter;
    private int satellites;
    private BigDecimal mass;
    private SmallPlanet smallPlanet;

    public static final boolean MYLKYWAYSTAR = true; //variabila de clasa


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

    public void setSmallPlanet(SmallPlanet smallPlanet /*parametrul metodei*/) {
        this.smallPlanet /*variabila de instanta*/ = smallPlanet; //parametrul metodei
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return this.diameter == star.diameter &&
                this.satellites == star.satellites &&
                this.starDescription.equals(star.starDescription) &&
                this.mass.equals(star.mass) &&
                this.smallPlanet.equals(star.smallPlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starDescription, diameter, satellites, mass, smallPlanet);
    }

    @Override
    public String toString() {
        return "Star{" +
                "starDescription='" + starDescription + '\'' +
                ", diameter=" + diameter +
                ", satellites=" + satellites +
                ", mass=" + mass +
                ", smallPlanet=" + smallPlanet +
                '}';
    }

    public SmallPlanet getSmallPlanet() {
        return this.smallPlanet; //variabila de instanta}


    }
}