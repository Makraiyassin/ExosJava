package coursAlex.exoThread;

public class Carcasse {
    private TypeCarcasse type;

    public Carcasse(TypeCarcasse type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Carcasse{" +
                "type=" + type +
                '}';
    }
}
