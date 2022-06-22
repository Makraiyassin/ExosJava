package coursAlex.competitionSportive.Exceptions;

public class LimiteAtteinteExceptions extends RuntimeException{

    private final int limite;
    public LimiteAtteinteExceptions(int limite) {
        super("le nombre max de participant est atteind");
        this.limite = limite;
    }

}
