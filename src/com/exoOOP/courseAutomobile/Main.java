package com.exoOOP.courseAutomobile;

import java.util.ArrayList;

import com.exoOOP.courseAutomobile.model.Car;
import com.exoOOP.courseAutomobile.model.Driver;
import com.exoOOP.courseAutomobile.model.Race;

public class Main {
    public static void main(String[] args) {
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("James", new Car("Porche",100,230)));
        drivers.add(new Driver("Terence", new Car("Ferarri",90,240)));
        drivers.add(new Driver("Yassin", new Car("Mitsubishi",80,250)));
        drivers.add(new Driver("Max", new Car("Bmw",110,220)));

        Race race = new Race(4, drivers);

        race.displayWinner();
        System.out.println(race);
    }
}
