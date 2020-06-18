import exception.MenuActionException;
import menu.item.MainMenuAction;
import menu.item.MenuItem;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static menu.MainMenuTextConst.*;
import static menu.MenuFactory.getMainMenu;

class Menu {

    private FileManager fileManager;
    private Scanner scanner;
    private Logger logger;

    Menu(String rootDirPath) {
        this.fileManager = new FileManager(rootDirPath);
        this.scanner = new Scanner(System.in);
        this.logger = new Logger(rootDirPath,fileManager);
    }

    void start() {
        while (true) {
            printMenuItems(getMainMenu(MainMenuAction.values()));
            try {
                int menuNumber = readIntFromConsole();
                MainMenuAction mainMenuAction = MainMenuAction.getMainMenuAction(menuNumber);
                mainMenuAction(mainMenuAction);
            } catch (MenuActionException e) {
                e.printStackTrace();
                printText(ACTION_ITEM_ERROR_MESSAGE);
            }
        }
    }

    private void mainMenuAction(MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case READ_FILE:
                workWithFiles();
                break;
            case ADD_FILE:
                addNewFileAction();
                break;
            case REMOVE_FILE:
                removeFileAction();
                break;
            case ADD_TEXT:
                addTextToFile();
                break;
            case EXIT:
                logger.addLog("Программа закрыта");
                System.exit(0);
        }

    }

    private File selectFile(){
        List<File> files = fileManager.getFileList();
        printFiles(files);
        return files.get(readIntFromConsole());
    }

    private void removeFileAction(){
        File file = selectFile();
        if(!file.delete()){
            printText(REMOVE_FILE_ERROR_MESSAGE);
        }
        else logger.addLog("файл "+file.getName()+" удалён");
    }

    private void addTextToFile(){
        File file = selectFile();
        String text = readStringLines();
        try{
            fileManager.addTextToFile(file,text);
            logger.addLog("файл "+file.getName()+" дозаписан");
        } catch (IOException e){
            e.printStackTrace();
            printText(ADD_TEXT_FILE_ERROR_MESSAGE);
        }
    }

    private void addNewFileAction() {

        String fileName = readStringFromConsole();
        String fileText = readStringLines();

        try {
            fileManager.writeFile(fileName, fileText);
            logger.addLog("файл "+fileName+" создан");
        } catch (IOException e) {
            e.printStackTrace();
            printText(WRITE_FILE_ERROR_MESSAGE);
        }
    }

    private void workWithFiles() {
        File file = selectFile();
        String text;
        try {
            text = fileManager.readFile(file);
            logger.addLog("файл "+file.getName()+" прочитан");
        } catch (IOException e) {
            e.printStackTrace();
            text = READ_FILE_ERROR_MESSAGE;
        }
        printText(text);
    }

    private <T> void printText(T text) {
        System.out.println(text.toString());
    }

    private void printFiles(List<File> files) {
        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            printText(String.format(ITEM_WITH_NUMBER, i, file.getName()));
        }
    }

    private void printMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            printText(menuItem);
        }
    }

    private int readIntFromConsole() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private String readStringFromConsole() {
        return scanner.nextLine();
    }

    private String readStringLines() {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = readStringFromConsole()) != null && !line.equals("*exit")) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}
