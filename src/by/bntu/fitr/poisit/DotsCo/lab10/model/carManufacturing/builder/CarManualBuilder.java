package by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.builder;

import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.cars.Manual;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.cars.Type;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Engine;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.GPSNavigator;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Transmission;


public class CarManualBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, gpsNavigator);
    }

}
