import java.util.ArrayList;
import java.util.Arrays;

public class Exo32 {
    private static int[] tab1;

    public static void main(String[] args) {

//        exo32-En considérant deux tableaux d'entiers (non triés), réalisez un algorithme qui
//        place tous les éléments des deux tableaux dans un troisième. Ce dernier doit être trié
//        une fois l'algorithme terminé. Notez que le tri doit être fait en même temps que la
//        fusion des deux tableaux et pas après
        int[] tab1 = new int[]{1,5,2,4,50,45,1,42,4};
        int[] tab2 = new int[]{51,5,22,4,40,45,6,62,45};
        Integer [] tab3 = new Integer[tab1.length + tab2.length];
        int minTab1;
        int minTab2;
        for (int i = 0; i < tab3.length; i++) {
            minTab1=minTab(tab1);
            minTab2=minTab(tab2);
            if(minTab1<=minTab2){
                tab3[i]= minTab1;
                tab1[getIndex(minTab1,tab1)] = -1;
            }else{
                tab3[i]= minTab2;
                tab2[getIndex(minTab2,tab2)] = -1;
            }
        }
        System.out.println(new ArrayList<>(Arrays.asList(tab3)));
    }
    static int minTab(int[]tab){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < tab.length; i++){
            if((tab[i] < min)&&(tab[i]!=-1)){
                min = tab[i];
            }
        }
        return min;
    }
    static int getIndex(int valeur, int[]tab){
        for(int i=0; i<tab.length; i++){
            if (valeur == tab[i]){
                return i;
            }
        }
        return -1;
    }
}
