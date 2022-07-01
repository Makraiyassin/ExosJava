package com.bxlFormation.exoOOP.courseAutomobile.model;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Race {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private  int distance;
    private int rounds;
    private ArrayList<Driver> drivers;

    public Race(int distance, int rounds, ArrayList<Driver> drivers) {
        this.distance = distance;
        this.rounds = rounds;
        this.drivers = drivers;
    }

    public void doRound(){
        for (Driver driver:drivers) {
//            int time=0;
//            int distanceTraveled=0;
//            int distanceMinute = driver.run()/60;  // example=> 200km/h divisé par 60  (3)
//            do{
//                time++;
//                distanceTraveled += distanceMinute;
//            }while(distanceTraveled<this.distance);

          double vitesse = driver.run()/3.6;
          double time = this.distance/vitesse;
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

        int min = Collections.min(totalTimes);
        int indexMax = totalTimes.indexOf(min);
        double record = (double)totalTimes.get(indexMax)/60;
        System.out.printf("le gagnant est: %s avec un record de %s  minutes !!!", drivers.get(indexMax).getName(), df.format(record));

    }

    @Override
    public String toString() {
        return "\ncourse : " +
                "distance : " + distance +
                "m, rounds : " + rounds +
                ", drivers : " + drivers +
                '}';
    }
}
