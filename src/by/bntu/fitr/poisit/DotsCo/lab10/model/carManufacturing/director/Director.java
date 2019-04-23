package by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.director;

import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.builder.Builder;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.cars.Type;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Engine;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.GPSNavigator;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Transmission;


public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
