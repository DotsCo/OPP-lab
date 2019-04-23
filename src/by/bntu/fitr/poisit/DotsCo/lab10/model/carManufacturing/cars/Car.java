package by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.cars;

import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Engine;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.GPSNavigator;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components.Transmission;
import org.apache.log4j.Logger;

public class Car {
    private static final Logger LOG = Logger.getLogger(Car.class);
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;
    private double usedFuel;
    
    public Car(Type type, int seats, Engine engine, Transmission transmission, 
            GPSNavigator gpsNavigator){
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }
       
    public Type getType(){
        return type;
    }
    
    public double getVolumeEngine() {
        return engine.getVolume();
    }
    
    public double getMileage() {
        return engine.getMileage();
    }
    
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    
    public double getFuel(){
        return fuel;
    }
    
    public double getUsingFuel() {
        return engine.getUsingFuel();
    }

    public double getUsedFuel() {
        return usedFuel;
    }

    public double leftFuel() {  
        if(fuel > usedFuel){
            return (fuel - usedFuel);
        }
        else return 0;
    }
    
    public int getSeats(){
        return seats;
    }
    
    public Engine getEngine(){
        return engine;
    }
    
    public Transmission getTransmission(){
        return transmission;
    }
    
    public GPSNavigator getGpsNavigator(){
        return gpsNavigator;
    }
    
     public void turnOn() {
        engine.on();
    }
    public void turnOff() {
        engine.off();
    }
    
    public void start(int speed, double hours) {       
        double distance = hours * speed;     
        usedFuel += distance / 100 * engine.getUsingFuel();
        engine.addMileage(distance);
       
    }
}
