package com.company;

public abstract class State {
    protected String name; // Название гос-ва
    protected double area; // Площадь
    protected double GDP; // ВВП
    protected long population; // Население

    public State(){
        this.name = "";
        this.area = 0;
        this.GDP = 0;
        this.population = 0;
    }

    public State(String name, double area, double GDP, long population){
        this.name = name;
        this.area = area;
        this.GDP = GDP;
        this.population = population;
    }

    public String getName(){ return name;}

    public void setName(String name){ this.name = name; }

    public double getArea(){return area;}

    public void setArea(double area){this.area = area;}

    public double getGDP(){return GDP;}

    public void setGDP(double GDP){this.GDP = GDP;}

    public long getPopulation(){return population;}

    public void setPopulation(long population){this.population = population;}

    public abstract double calculatePopulationDensity();

    public abstract double calculateGPTPerCapita();

    @Override public String toString(){
        return "Название государства: " + name + ", площадь: " + area + ", ВВП: " + GDP + ", население: " + population;
    }

}
