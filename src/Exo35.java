public class Exo35 {
    public static void main(String[] args) {
        int[] tab1 = new int[]{1,5,2,4,50,45,1,42,4,5};
        int[] tab2 = new int[]{51,5,22,4,40,45,6,62,4,8,94};
        for (int elem:merge(tab1,tab2)) {
            System.out.print(elem+",");
        }
    }
    static int[] merge(int[] tab1,int[]tab2){
        int [] tab3 = new int[tab1.length + tab2.length];
        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tab3[i+tab1.length]=tab2[i];
        }
        return tab3;
    }
}
