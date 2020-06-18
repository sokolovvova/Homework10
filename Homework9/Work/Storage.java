package Work;

import java.util.concurrent.locks.ReentrantLock;

public class Storage {

    public ReentrantLock loadLock;
    public ReentrantLock unloadLock;

    public Storage() {
        this.loadLock = new ReentrantLock();
        this.unloadLock = new ReentrantLock();
    }

    public void loading(int c){

        try {
            loadLock.lock();
            MessagePrinter.print("Start Loading");
            Thread.sleep(2000*c);
            MessagePrinter.print("Loaded");
            loadLock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void unloading(int c){

        try {
            unloadLock.lock();
            MessagePrinter.print("Start Unloading");
            Thread.sleep(1000*c);
            MessagePrinter.print("Unloaded");
            unloadLock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
