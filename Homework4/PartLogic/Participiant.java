package PartLogic;

public class Participiant {
    private int[] playerNumbers;
    private int orderNumber;
    private boolean isSelected;
    private boolean isWinner;

    public Participiant(int[] playerNumbers,int orderNumber){
        this.playerNumbers=playerNumbers;
        this.orderNumber=orderNumber;
    }

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }

    public int getOrderNumber() {
        return orderNumber;
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
