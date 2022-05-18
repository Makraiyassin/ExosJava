import java.util.Scanner;

public class Exo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un nombre de joueur: ");
        int tmp = Integer.parseInt(sc.nextLine());
        while(!(tmp<=10 && tmp>0)){
            System.out.println("le nombre de joueur est incorect (entre 1 et 10 joueur)...\n entrez un nombre de joueur: ");
            tmp = Integer.parseInt(sc.nextLine());
        }
        int N = tmp ;
        double [] myTab = new double[N];
        double total=0;
        double moyenne;

        for(int i=0; i< myTab.length; i++ ){
            System.out.printf("entrez le score du joueur %s: ",i+1);
            double score =   Double.parseDouble(sc.nextLine());
            myTab[i] = score;
            total+=score;
        }

        moyenne = total/myTab.length;
        System.out.println(moyenne);

    }
}
