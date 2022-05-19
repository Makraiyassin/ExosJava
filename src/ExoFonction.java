import java.util.ArrayList;

public class ExoFonction {
    public static void main(String[] args) {
//        String word = "kayak";
//        System.out.println(isPalindrome(word));
//        System.out.println(pairNumbers(30,20));
        System.out.println(fibonnacci(8));

    }

    public static String reverseString(String word){
        String tmp = "";
        for (int i = word.length()-1; i >= 0; i--) {
            tmp+= word.charAt(i);
        }

        return tmp;
    }

    public static boolean isPalindrome(String word){
        return word.equals(reverseString(word));
    }

    public static ArrayList<Integer>  pairNumbers(int a, int b){
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = a; i < b; i++) {
            if(i%2 == 0){
                tmp.add(i);
            }
        }
        return tmp;
    }

//- Fonction qui renvoie la valeur à l'index envoyé en parametre de la suite de Fibonnacci
//    0	  1  1	2	3	5	8	13	21	34	55	89	144	233	377	610	987

    public static int fibonnacci(int n){
        int result = n;
        if (n>1) {
            int tmp1 = 0;
            int tmp2 = 1;
            for (int i = 2; i <= n; i++) {
                result = tmp1 + tmp2;
                tmp1=tmp2;
                tmp2 = result;

                System.out.println();
            }
        }
        return result;
    }
//- Procédure qui prend en paramètre une liste d'invité et qui affiche des couples de donneurs/receveur (par exemple
//pour des cadeaux de noël)
}
