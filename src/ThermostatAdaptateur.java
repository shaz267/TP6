import thermos.*;

public class ThermostatAdaptateur implements Appareils{

    private Thermostat thermostat;

    public ThermostatAdaptateur(){

        thermostat = new Thermostat();
    }

    public void allumer(){

        thermostat.monterTemperature();
    }

    public void eteindre(){

        thermostat.baisserTemperature();
    }
}
