package coursAlex.exoThermometre.Models;

public class Thermometre {
    private int temperature;
    public Thermometre(int temperatureActuel){
        this.temperature = temperatureActuel;
    }
    public void setTemperature(int newTemperature){
        if(this.temperature < newTemperature)
            subTempMonte( temp -> System.out.printf("\nla temperature a augmenter de %s degres", newTemperature-temp));

        if(this.temperature > newTemperature)
            subTempDesc( temp -> System.out.printf("\nla temperature a diminuer de %s degres", temp-newTemperature));

        this.temperature = newTemperature;
    }
    private void subTempMonte(ThermoListener listener){
        listener.notification(this.temperature);
    }
    private void subTempDesc(ThermoListener listener){
        listener.notification(this.temperature);
    }
}