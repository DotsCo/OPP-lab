package by.bntu.fitr.poisit.DotsCo.lab10.model.carManufacturing.components;

public class GPSNavigator {
    private final String route;
    
    public GPSNavigator(){
        this.route = "Minsk, Lobanka 81";
    }
    
    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }
    
    public String getRoute(){
        return route;
    }
}
