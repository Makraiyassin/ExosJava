import java.util.Scanner;

public class Exo29 {
    public static void main(String[] args) {
        int [] myTab = new int[] {1,2,3,4,5,6,7,8,9,10 };
//        for(int elem : myTab ){
//            System.out.println(elem);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez (g) pour aller a gauche, (d) pour aller à droite et (q) pour quitter:  ");
        String tmp = sc.nextLine();
        int index = 0;
        while(true){
            if(tmp.equals("q")){
                System.out.println("vous etes sur le "+myTab[index]+" et vous quittez.");
                break;
            } else if (tmp.equals("d")) {
                index = index == 9 ? 0 : index+1;
                System.out.println("vous etes sur le "+myTab[index]);
                System.out.println("entrez (g) pour aller a gauche, (d) pour aller à droite et (q) pour quitter:  ");
                tmp = sc.nextLine();

            }else if (tmp.equals("g")) {
                index = index == 0 ? 9 : index-1;
                System.out.println("vous etes sur le "+myTab[index]);
                System.out.println("entrez (g) pour aller a gauche, (d) pour aller à droite et (q) pour quitter:  ");
                tmp = sc.nextLine();

            }else{
                System.out.println("Entrée incorect! \n Entrez (g) pour aller a gauche, (d) pour aller à droite et (q) pour quitter:  ");
                tmp = sc.nextLine();
            }
        }

    }
}
