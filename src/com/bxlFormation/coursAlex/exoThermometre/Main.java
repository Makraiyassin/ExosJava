package coursAlex.exoThermometre;

import coursAlex.exoThermometre.Models.ThermoListener;
import coursAlex.exoThermometre.Models.Thermometre;

public class Main {
    public static void main(String[] args) {
        Thermometre termo = new Thermometre(20);
        termo.setTemperature(15);
        termo.setTemperature(20);
        termo.setTemperature(35);
        termo.setTemperature(3);

    }
}
