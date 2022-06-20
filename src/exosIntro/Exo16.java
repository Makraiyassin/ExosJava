public class Exo16 {
    public static void main(String[] args) {
        System.out.println(rightPrice(200, 201));
    }
    static String rightPrice(int numberToGuess, int guessNumber){
        if(guessNumber>numberToGuess){
            return "c'est moins";
        } else if(guessNumber<numberToGuess) {
            return "c'est plus";
        }
        return "C’est gagné";
    }
}

