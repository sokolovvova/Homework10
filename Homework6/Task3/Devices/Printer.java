package Task3.Devices;

public class Printer extends Device{
    public Printer(String name) {
        super(name, Type.PRINTER);
    }


    public void print(String message) {
        System.out.println("Сообщение '"+message+"' печатается на устройстве '"+type.getTitle()+"' с названием '"+name+"'");
    }
}
