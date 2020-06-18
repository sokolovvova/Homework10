package menu;

import menu.item.MainMenuAction;
import menu.item.MenuItem;

import java.util.LinkedList;
import java.util.List;

import static menu.MainMenuTextConst.*;

public class MenuFactory {

    public static List<MenuItem> getMainMenu(MainMenuAction... menuActions) {
        LinkedList<MenuItem> linkedList = new LinkedList<>();
        for (int i = 0; i < menuActions.length; i++) {
            MenuItem menuItem = getMainMenuItem(i, menuActions[i]);
            if (menuItem != null) {
                linkedList.add(menuItem);
            }
        }
        return linkedList;
    }

    private static MenuItem getMainMenuItem(int ind, MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case READ_FILE:
                return new MenuItem(ind, ITEM_TEXT_READ_FILES);
            case ADD_FILE:
                return new MenuItem(ind, ITEM_TEXT_ADD_FILE);
            case REMOVE_FILE:
                return new MenuItem(ind, ITEM_TEXT_REMOVE_FILE);
            case ADD_TEXT:
                return new MenuItem(ind, ITEM_ADD_TEXT_FILE);
            case EXIT:
                return new MenuItem(ind, ITEM_TEXT_EXIT);
        }
        return null;
    }

    private MenuFactory() {
    }
}
