package Task3;

import Task3.GS.GameSimulator;
import Task3.PartLogic.ParticipiantFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status=true;
        while (status){
            ParticipiantFactory pf = new ParticipiantFactory();
            GameSimulator gamesim = new GameSimulator();
            gamesim.PartListGen(pf);
            gamesim.PlayerSelect();
            gamesim.WinnerSetter();
            gamesim.WinnerNumbersPrinter();
            gamesim.printWinnerPart();

            System.out.print("Хотите сыграть ещё?\n1 - да\n0 - нет\n> ");
            int n=scanner.nextInt();
            switch (n){
                case 1:
                    continue;
                case 0:
                    status=false;
                    break;
            }
        }
    }

}
