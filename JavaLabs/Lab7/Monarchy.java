package com.company;

public class Monarchy extends State{

    protected String monarch; // Имя монарха
    protected boolean isAbsolute; // Является ли абсолютной монархией

    public Monarchy() {
        super();
        this.monarch = "";
        this.isAbsolute = true;
    }

    public Monarchy(String name, double area, double GDP, long population, String monarch, boolean isAbsolute) {
        super(name, area, GDP, population);
        this.monarch = monarch;
        this.isAbsolute = isAbsolute;
    }

    public String getMonarch() {
        return monarch;
    }

    public void setMonarch(String monarch) {
        this.monarch = monarch;
    }

    public boolean isAbsolute() {
        return isAbsolute;
    }

    public void setAbsolute(boolean isAbsolute) {
        this.isAbsolute = isAbsolute;
    }

    public void changeAbsoluteStat(){

    }

    @Override
    public double calculatePopulationDensity() {
        return population / area;
    }

    @Override
    public double calculateGPTPerCapita() {
        return GDP / population;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", Монарх: " + monarch;
        if(isAbsolute) str += " - Абсолютный";
        else str += " - Парламентарный";
        return str;
    }
}
