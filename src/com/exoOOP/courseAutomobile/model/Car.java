package com.exoOOP.courseAutomobile.model;

import java.util.Random;

public class Car {
    private String name;
    private int speedMin;
    private int speedMax;
    private Random random;

    public Car(String name, int speedMin, int speedMax){
        this.name=name;
        this.speedMin=speedMin;
        this.speedMax=speedMax;
        this.random=new Random();
    }

    public int run(){
        return random.nextInt(speedMin, speedMax);
    }

//#region getters and setters

    public String getName() {
        return name;
    }

//endregion

}
