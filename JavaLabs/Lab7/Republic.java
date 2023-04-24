package com.company;

public class Republic extends State {

    protected String electGovernment; // Выбранное правительство

    public Republic() {
        super();
        this.electGovernment = "";
    }

    public Republic(String name, double area, double GDP, long population, String electGovernment) {
        super(name, area, GDP, population);
        this.electGovernment = electGovernment;
    }

    public String getElectGovernment() {return electGovernment;}

    public void setElectGovernment() {this.electGovernment = electGovernment;}

    @Override
    public double calculatePopulationDensity() {
        if (area <= 0) return 0;
        return population / area;
    }

    @Override
    public double calculateGPTPerCapita() {
        if (population <= 0) return 0;
        return GDP / population;
    }

    @Override
    public String toString() {
        return super.toString() + ", выбранное правительство: " + electGovernment;
    }
}
