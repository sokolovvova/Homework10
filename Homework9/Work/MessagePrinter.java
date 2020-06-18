package Work;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class MessagePrinter {
    public static void print(String logMsg){
        Thread thread = Thread.currentThread();
        DateFormat dateFormat = new SimpleDateFormat("[HH:mm:ss]");
        System.out.println(dateFormat.format(new Date())+" "+thread.getName()+"   "+logMsg+"\n");
    }
}
