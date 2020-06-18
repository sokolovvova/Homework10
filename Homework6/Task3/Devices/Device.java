package Task3.Devices;

 public abstract class Device  {
     protected String name;
     protected Type type;


     public Device() {
     }

     public Device(String name, Type type) {
         this.name = name;
         this.type = type;
     }

     public String getInfo(){
         return ("Устройство '"+type.getTitle()+"' с названием '"+name+"'");
     }

     public void print(String message) {
         System.out.println("Сообщение '"+message+"' выводится на устройстве '"+type.getTitle()+"' с названием '"+name+"'");
     }
 }
