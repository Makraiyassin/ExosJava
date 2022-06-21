import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une année: ");

        int year =   Integer.parseInt(sc.nextLine());

        boolean divisible4 = year%4==0;
        boolean divisible100 = year%100==0;
        boolean divisible400 = year%400==0;

        if((divisible4 && !divisible100)|| divisible400){
            System.out.printf("%s est une année bissextile :)", year);
        }else{
            System.out.printf("%s n'est pas une année bissextile !", year);
        }
    }
}
