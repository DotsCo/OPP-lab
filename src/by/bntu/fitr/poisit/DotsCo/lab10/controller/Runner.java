package by.bntu.fitr.poisit.DotsCo.lab10.controller;

import org.apache.log4j.Logger;

import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.builder.CarManualBuilder;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.builder.CarBuilder;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.cars.Car;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.cars.Manual;
import by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.director.Director;



public class Runner {
    private static final Logger LOG;
    
    static {
        LOG = Logger.getRootLogger();
    }
    
     public static void main(String[] args) {
        // сделать меню !
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        
        director.constructCityCar(builder);
        
        Car car = builder.getResult();    
        LOG.info("Car built:\n" + car.getType());
    
        CarManualBuilder manualBuilder = new CarManualBuilder();
        
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        LOG.info("\nCar manual built:\n" + carManual.print());
        
        // сделать проверку на топливо > 0!!!
        car.setFuel(20);
        car.turnOn();
        car.start(70, 2);
        
        
        LOG.info("Mileage " + car.getMileage() + " km");
        LOG.info("Fuel before start " + car.getFuel() + " liters");
        LOG.info("Fuel consumption " + car.getUsingFuel() + " liters per 100 km");
        LOG.info("Spent fuel for the last run " + car.getUsedFuel() + " liters");
        LOG.info("Fuel left " + car.leftFuel() + " liters");

    }

}
