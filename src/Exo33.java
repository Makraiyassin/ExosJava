public class Exo33 {
    public static void main(String[] args) {
        int[] tab = new int[]{51,5,22,4,40,45,6,62,45};
        int min = tab[0];
        for(int i = 0; i < tab.length; i++){
            if((tab[i] < min)&&(tab[i]>-1)){
                min = tab[i];
            }
        }
        System.out.println(min);;
    }


}
