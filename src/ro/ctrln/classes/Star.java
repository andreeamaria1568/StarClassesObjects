package ro.ctrln.classes;

import java.math.BigDecimal;

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

    public SmallPlanet getSmallPlanet(){
        return this.smallPlanet; //variabila de instanta

    }
    public String computeSmallPlanetLocation(SmallPlanet smallPlanet, int location) {
        String planetLocation = this.starDescription + smallPlanet.getPlanetName() + location; //variabila locala
        return "";
    }
}

    class SmallPlanet {
    private String planetName;

        public String getPlanetName() {
            return this.planetName;
        }
    }