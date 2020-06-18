package Task3.PartLogic;

import java.util.ArrayList;
import java.util.HashSet;

public class Participiant {
    private ArrayList<Integer> playerNumbers;
    private boolean isSelected;
    private boolean isWinner;

    public Participiant(HashSet<Integer> playerNumbers){
        this.playerNumbers=new ArrayList<>(playerNumbers);
    }

    public ArrayList<Integer> getPlayerNumbers() {
        return playerNumbers;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public boolean isWinner() {
        return isWinner;
    }
}
