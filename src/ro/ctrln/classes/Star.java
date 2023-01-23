package ro.ctrln.classes;

import java.math.BigDecimal;

public class Star {


    private String starDescription;
    private int diameter;
    private int satellites;
    private BigDecimal mass;

    public Star() {}
    public Star (String starDescriprion, int diameter, int satellites, BigDecimal mass) {
        this.starDescription = starDescription;
        this.diameter = diameter;
        this.satellites = satellites;
        this.mass = mass;
    }
    public String getStarDescription() {
        return starDescription;
    }
    public int getDiameter () {
        return diameter;
    }

    public int getSatellites() {
        return satellites;
    }
    public BigDecimal getmass() {
        return mass;
    }

    public void setStarDescription(String starDescription) {
       this.starDescription = starDescription;
    }

    public void setDiameter (int diameter) {
        this.diameter = diameter;
    }
    public void setSatellites (int satellites) {
        this.satellites = satellites;

    }
    public void setMass (BigDecimal mass) {
        this.mass = mass;
    }
}
