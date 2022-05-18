public class Exo15 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=9){
            System.out.printf("-----------------------table de %s ----------------------",i);
            for(int j = 0 ;j <= (i * 10); j += i){
                System.out.println(j);
            }
            i++;
        }
    }
}
