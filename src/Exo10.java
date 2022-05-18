import java.util.Scanner;

public class Exo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un nombre: ");
        int a =   Integer.parseInt(sc.nextLine());

        System.out.println("choisissez un operateur (+,-,*,/): ");
        String operator =  sc.nextLine();

        System.out.println("entrez un nombre: ");
        int b =   Integer.parseInt(sc.nextLine());

        System.out.println(calculator(a,operator,b));
    }
    static double calculator(double a,String operator, double b){
        double result=0;
        switch (operator){
            case "+":
                result= a+b;
                break;
            case "-":
                result= a-b;
                break;
            case "*":
                result= a*b;
                break;
            case "/":
                result= a/b;
                break;
            default:
                break;
        }
        return result;
    }
}
