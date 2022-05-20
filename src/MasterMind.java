import java.util.*;

public class MasterMind {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("jaune", "bleu", "rouge", "vert", "blanc", "noir"));
        ArrayList<String> guess = new ArrayList<>(Arrays.asList("","","",""));
//        ArrayList<String> secret = new ArrayList<>(Arrays.asList("jaune", "vert", "rouge", "bleu"));
        ArrayList<String> secret = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            secret.add(colors.get(rng.nextInt(colors.size()-1)));
        }
        System.out.print("reponse: ");System.out.println(secret);

        System.out.println("Entré 4 couleurs parmis les suivante: jaune, bleu, rouge, vert, blanc, noir (attention à l'ortographe!)");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Couleur %s: ", i+1);
            guess.set(i,sc.nextLine());
        }

        ArrayList<String> solution = new ArrayList<>(Arrays.asList("rouge","rouge","rouge","rouge"));
        int tries = 9;

        while(true){
            System.out.print("tu as:");System.out.println(guess);
            System.out.println(masterMind(secret,guess));
            System.out.printf("---------------il reste %s essais ------------\n",tries);

            if (masterMind(secret,guess).equals(solution)){
                System.out.println("gagné");
                break;
            }else{
                tries--;
                System.out.println("Entré 4 couleurs parmis les suivante: jaune, bleu, rouge, vert, blanc, noir (attention à l'ortographe!) ");
                for (int i = 0; i < 4; i++) {
                    System.out.printf("Couleur %s: ", i+1);
                    guess.set(i,sc.nextLine());
                }
            }

            if (tries == 0){
                System.out.println("\nperdu");
                break;
            }
        }
    }
    public static ArrayList<String> masterMind(ArrayList<String> secret, ArrayList<String> guess){
        ArrayList<String> response = new ArrayList<>();
        ArrayList<String> tmpSecret = new ArrayList<>(secret);
        ArrayList<String> tmpGuess = new ArrayList<>(guess);

        for (int i = 0; i < tmpSecret.size(); i++) {
            if (tmpSecret.get(i).equals(tmpGuess.get(i))){
                response.add("rouge");
                tmpSecret.set(i, "0");
                tmpGuess.set(i, "1");
            }
        }

        for (String elem : tmpGuess) {
            if (tmpSecret.contains(elem)) {
                response.add("blanc");
            }
        }
        Collections.sort(response);
        return response;
    }
}

