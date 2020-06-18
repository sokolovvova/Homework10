import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private FileManager fm;
    private File logFile;
    private String LogDir;

    public Logger(String path,FileManager fm) {
        this.fm=fm;
        this.LogDir=path;
        createLogger();
    }

    private String logPrinter(String logMsg){
        DateFormat dateFormat = new SimpleDateFormat("[yyyy/MM/dd HH:mm:ss]");
        return dateFormat.format(new Date())+" "+logMsg+"\n";
    }

    private void createLogger(){
        logFile = new File(LogDir,"log.txt");
        try {
            if(!logFile.exists()) {
                fm.writeFile("log.txt", "Log: " + "\n");
            }
            addLog("Программа запущенна");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addLog(String logMsg){
        try {
            fm.addTextToFile(logFile,logPrinter(logMsg));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
