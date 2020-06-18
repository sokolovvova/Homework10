package Task3.Devices;

public abstract class ScreenDevice extends Device {

    public ScreenDevice(String name, Type type) {
        super(name, type);
    }

    public void print(String message) {
        System.out.println("Сообщение '"+message+"' отображается на устройстве '"+type.getTitle()+"' с названием '"+name+"'");
    }
}
