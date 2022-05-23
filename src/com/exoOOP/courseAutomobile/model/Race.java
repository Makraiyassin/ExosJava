package com.exoOOP.courseAutomobile.model;


import java.util.ArrayList;
import java.util.Collections;

public class Race {
    private  int distance;
    private int rounds;
    private ArrayList<Driver> drivers;

    public Race(int rounds, ArrayList<Driver> drivers) {
        this.distance = 20;
        this.rounds = rounds;
        this.drivers = drivers;
    }

    public void doRound(){
        for (Driver driver:drivers) {
            int time=0;
            int distanceTraveled=0;
            int distanceMinute = driver.run()/60;  // example=> 200km/h divisé par 60  (3)
            do{
                time++;
                distanceTraveled += distanceMinute;
            }while(distanceTraveled<this.distance);

            driver.makeRound(time);
        }
    }

    public void racing(){
        for (int i = 0; i < rounds; i++) {
            this.doRound();
        }
    }

    public void displayWinner(){
        this.racing();

        ArrayList<Integer> totalTimes = new ArrayList<>();
        for (int i = 0; i < this.drivers.size(); i++) {
            Driver driver = this.drivers.get(i);
//            System.out.println(driver);
            totalTimes.add(driver.getTotalTime());
        }

        Integer min = Collections.min(totalTimes);
        Integer indexMax = totalTimes.indexOf(min);

        System.out.printf("le gagnant est: %s avec un record de %s  minutes !!!", drivers.get(indexMax).getName(), totalTimes.get(indexMax));

    }

    @Override
    public String toString() {
        return "\ncourse : " +
                "distance : " + distance +
                ", rounds : " + rounds +
                ", drivers : " + drivers +
                '}';
    }
}
