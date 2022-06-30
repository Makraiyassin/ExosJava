import java.lang.reflect.Array;
import java.util.*;

public class ExoFonction {
    public static void main(String[] args) {
//        String word = "kayak";
//        System.out.println(isPalindrome(word));
//        System.out.println(pairNumbers(30,20));
//        System.out.println(fibonnacci(16));
        String[] poeple = new String[] {"a","b","c","d"};
        System.out.println(gifts(poeple));
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

    public static Map<String, String> gifts(String[] poeple) {
//        String[] tmp = randArray(poeple);
        ArrayList<String> tmp =  new ArrayList<>(Arrays.asList(poeple));
        Collections.shuffle(tmp);
        Map<String, String> duo = new HashMap<>();
        for (int i = 0; i < tmp.size()-1; i++) {
            duo.put(tmp.get(i), tmp.get(i + 1));
        }
        duo.put(tmp.get(tmp.size() - 1), tmp.get(0));

        return duo;
    }

    public static String[] randArray(String[] array){
        // Creating object for Random class
        Random rd = new Random();

        // Starting from the last element and swapping one by one.
        for (int i = array.length-1; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = rd.nextInt(i+1);

            // Swap array[i] with the element at random index
            String  tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}
