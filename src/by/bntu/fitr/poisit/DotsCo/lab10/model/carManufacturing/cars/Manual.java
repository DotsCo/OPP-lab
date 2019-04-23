package by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.cars;

import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Engine;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.GPSNavigator;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Transmission;

public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

  
     public String print() {
        StringBuilder builder = new StringBuilder();
        builder.append("Type of car: ").append(type).append("\n");
        builder.append("Count of seats: ").append(seats).append("\n");
        builder.append("Engine: volume - ").append(engine.getVolume()).append("; mileage - ")
               .append(engine.getMileage()).append("\n");
        builder.append("Transmission: ").append(transmission).append("\n");
        
        if (this.gpsNavigator != null) {
            builder.append("GPS Navigator: Functional").append("\n");
        } else {
            builder.append("GPS Navigator: N/A").append("\n");
        }
        return builder.toString();
    }
}
