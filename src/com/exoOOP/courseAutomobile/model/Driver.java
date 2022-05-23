package com.exoOOP.courseAutomobile.model;

import java.util.ArrayList;
public class Driver {
    private String name;
    private Car car;
    private ArrayList<Integer> timesList;

    public String getName() {
        return name;
    }

    public int getTotalTime(){
        int tmp = 0;
        for (int elem : this.timesList) {
            tmp+= elem;
        }
        return tmp;
    }

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
        this.timesList= new ArrayList<>();
    }
    public int run(){
        return this.car.run();
    }
    public void makeRound(int time){
        timesList.add(time);
    }

    @Override
    public String toString() {
        return "\nDriver{" +
                "Nom : " + name +
                ", Voiture : " + car.getName() +
                ", Temps : " + timesList +
                '}';
    }
}
