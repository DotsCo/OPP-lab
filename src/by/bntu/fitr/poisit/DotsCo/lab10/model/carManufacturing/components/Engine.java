package by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components;

import org.apache.log4j.Logger;

public class Engine {
    private static final Logger LOG = Logger.getLogger(Engine.class);
    
    private final double volume;
    private final double usingFuel;
    private double mileage;
    private boolean started;
    
    
    public Engine(double volume, double mileage){
        this.volume = volume;
        this.mileage = mileage;
        usingFuel = volume * 4;
    }
    
    public void on(){
        started = true;
    }
    
    public void off(){
        started = false;
    }
    
    public boolean isStarted(){
        return started;
    }
    
    public void addMileage(double mileage){
        if(started) {
            this.mileage += mileage;
        }
        else {
            LOG.error("Cannot go, you must start engine first"); 
        }
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getUsingFuel() {
        return usingFuel;
    }
    
    public double getMileage(){
        return mileage;
    }
}
