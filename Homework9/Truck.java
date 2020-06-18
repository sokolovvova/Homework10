import Work.Storage;
import Work.Traveling;

public class Truck extends Thread {
    private int cargo;
    private int truckNumber;
    private Storage storage;

    public Truck(int truckNumber,int cargoSize, Storage storage){
        this.cargo=cargoSize;
        this.truckNumber=truckNumber;
        this.storage = storage;
    }
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String truckName = "Truck " + truckNumber + "(cargo=" + cargo + ")";
        thread.setName(truckName);
        while(true) {
            storage.loading(cargo);
            Traveling.travelToUnLoad();
            storage.unloading(cargo);
            Traveling.travelToLoad();
        }
    }
}
