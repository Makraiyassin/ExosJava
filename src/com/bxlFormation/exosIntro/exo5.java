package com.bxlFormation.exosIntro;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre de secondes: ");

        int seconds=  Integer.parseInt(sc.nextLine());
        System.out.println(timeConvertor(seconds));
    }
    public static String timeConvertor(int secondsTotal){
        int seconds,minutes, hours, days, hoursTotal, minutesTotal;
//        days = seconds/86400;
//        seconds-=(days*86400);

//        hours = seconds/3600;
//        seconds-=(hours*3600);

//        minutes = seconds/60;
//        seconds-=(minutes*60);

        seconds = secondsTotal%60;

        minutesTotal = secondsTotal/60;
        minutes = minutesTotal%60;

        hoursTotal = minutesTotal / 60;
        hours = hoursTotal%24;

        days = hoursTotal/24;

        return String.format("%s days %s hours %s minutes %s seconds",days,hours,minutes,seconds);
    }
}
