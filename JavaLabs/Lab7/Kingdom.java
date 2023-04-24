package com.company;

public class Kingdom extends Monarchy implements Comparable<Kingdom>{

    protected String capital; // Столица

    public Kingdom(String capital) {
        super();
        this.capital = capital;
    }

    public Kingdom(String name, double area, double GDP, long population, String monarch, boolean isAbsolute, String capital) {
        super(name, area, GDP, population, monarch, isAbsolute);
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return super.toString() + ", столица - " + capital;
    }

    @Override
    public int compareTo(Kingdom o) {
        if(o == null) return -1;
        return this.area < o.area ? -1 : this.area > o.area ? 1 : 0; // Вохвращает -1, если площадь o > этого, 0 - если равны, и 1, если этот >.
    }
}
