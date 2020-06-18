import Work.Storage;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private List<Truck> truckList;

    public Simulation(int...trucks){
        truckList=new ArrayList<>();
        Storage storage = new Storage();
        for(int c=0;c<trucks.length;c++){
            truckList.add(new Truck(c+1,trucks[c], storage));
        }
    }
    public void startSim(){
        for(Truck t:truckList){
            t.start();
        }
    }
}
