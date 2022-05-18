import java.util.Arrays;

public class Exo25 {
    public static void main(String[] args) {
        int [] myTab = new int[] {1, 2, 3, 4, 5, 6};
        int [] myTab2 = new int[myTab.length];
        int lastIndex = myTab.length-1;

        for(int i=0; i < myTab.length; i++ ){
            myTab2[i] = myTab[lastIndex - i];
        }
        for (int elem:myTab) {
            System.out.println(elem);
        }        for (int elem:myTab2) {
            System.out.println(elem);
        }
    }
}
