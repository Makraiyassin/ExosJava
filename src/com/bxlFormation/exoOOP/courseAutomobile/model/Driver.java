package com.bxlFormation.exoOOP.courseAutomobile.model;

import java.util.ArrayList;
public class Driver {
    private String name;
    private Car car;
    private ArrayList<Double> timesList;

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
        this.timesList= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTotalTime(){
        int tmp = 0;
        for (double elem : this.timesList) {
            tmp+= elem;
        }
        return tmp;
    }

    public int run(){
        return this.car.run();
    }
    public void makeRound(double time){
        timesList.add(time);
    }

    @Override
    public String toString() {
        return "\nDriver{" +
                "Nom : " + name +
                ", Voiture : " + car.getName() +
                ", Temps (en secondes) : " + timesList +
                '}';
    }
}
