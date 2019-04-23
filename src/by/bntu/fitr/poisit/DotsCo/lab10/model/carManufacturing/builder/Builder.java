package by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.builder;

import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.cars.Type;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Engine;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.GPSNavigator;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Transmission;


public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGPSNavigator(GPSNavigator gpsNavigator);   
}
