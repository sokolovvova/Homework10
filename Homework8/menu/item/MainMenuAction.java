package menu.item;

import exception.MenuActionException;

public enum MainMenuAction {
    READ_FILE, ADD_FILE, REMOVE_FILE, ADD_TEXT, EXIT;

    public static MainMenuAction getMainMenuAction(int actionNumber) throws MenuActionException {
        MainMenuAction[] valuesArr = values();
        if (actionNumber >=0 && actionNumber < valuesArr.length) {
            return valuesArr[actionNumber];
        }
        throw new MenuActionException("Wrong action number");
    }
}
