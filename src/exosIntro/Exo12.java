import java.util.Scanner;

public class Exo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days1, hours1, minutes1, seconds1;
        System.out.println("nombre de days1: ");
        days1 =   Integer.parseInt(sc.nextLine());
        System.out.println("nombre de hours1: ");
        hours1 =   Integer.parseInt(sc.nextLine());
        System.out.println("nombre de minutes1: ");
        minutes1 =   Integer.parseInt(sc.nextLine());
        System.out.println("nombre de seconds1: ");
        seconds1 =   Integer.parseInt(sc.nextLine());
        int result1 = seconds1+(minutes1*60)+(hours1*3600)+(days1*86400);

        int days2, hours2, minutes2, seconds2;
        System.out.println("nombre de days2: ");
        days2 =   Integer.parseInt(sc.nextLine());
        System.out.println("nombre de hours2: ");
        hours2 =   Integer.parseInt(sc.nextLine());
        System.out.println("nombre de minutes2: ");
        minutes2 =   Integer.parseInt(sc.nextLine());
        System.out.println("nombre de seconds2: ");
        seconds2 =   Integer.parseInt(sc.nextLine());
        int result2 = seconds2+(minutes2*60)+(hours2*3600)+(days2*86400);

        int finalResult;

        if(result1>result2){
            finalResult =  result1-result2;
        }else{
            finalResult =  result2-result1;
        }

        System.out.println("la différence entre la première durée et la deuxième durée:\n"+timeConvertor(finalResult));
    }

    public static String timeConvertor(int secondsTotal){
        int seconds,minutes, hours, days, hoursTotal, minutesTotal;
        seconds = secondsTotal%60;

        minutesTotal = secondsTotal/60;
        minutes = minutesTotal%60;

        hoursTotal = minutesTotal / 60;
        hours = hoursTotal%24;

        days = hoursTotal/24;

        return String.format("%s days %s hours %s minutes %s seconds",days,hours,minutes,seconds);
    }
}
