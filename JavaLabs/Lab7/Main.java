package com.company;

public class Main {

    public static void main(String[] args) {

        Republic r = new Republic("Башкортостан", 142_947, 1_673.7, 4_080_684, "Правительство Республики Башкортостан");

        Monarchy m = new Monarchy("Япония", 377_976, 5_451_000, 125_309_000, "Нарухито", false);

        Kingdom k = new Kingdom("Швеция", 447_435, 570_800.8, 10_514_692, "Карл XVI Густав", false, "Стокгольм");

        System.out.println(r);
        System.out.println(m);
        System.out.println(k);

        System.out.println(k.calculatePopulationDensity() + " (ч/км^2) плотность населения государства " + k.getName());

        System.out.println(k.compareTo(null));
    }
}
