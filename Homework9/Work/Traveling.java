package Work;

public class Traveling {

    public static void travelToLoad(){
        try {
            MessagePrinter.print("Start traveling to LoadStorage");
            Thread.sleep(5000);
            MessagePrinter.print("Arrive at LoadStorage");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void travelToUnLoad(){
        try {
            MessagePrinter.print("Start traveling to UnloadStorage");
            Thread.sleep(5000);
            MessagePrinter.print("Arrive at UnloadStorage");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
