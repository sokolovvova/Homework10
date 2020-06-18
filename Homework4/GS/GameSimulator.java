package GS;

import PartLogic.Participiant;
import PartLogic.ParticipiantFactory;

import java.util.Scanner;

public class GameSimulator {

    private int[] winNumbers;
    private Participiant[] participiants;

    public GameSimulator(){
        winNumbers= NumberGenerator.NumGen(6);
    }

    public void PartListGen(ParticipiantFactory pf){
        Scanner scanner = new Scanner(System.in);
        int partNum;
        Participiant[] list;
        System.out.print("Введите количество игроков: \n>");
        partNum=scanner.nextInt();
        list=pf.PartCreator(partNum);
        this.participiants=list;
    }

    public void ParticipiansPrinter(Participiant[] partList){
        for(Participiant part:partList){
            System.out.println("Игрок "+part.getOrderNumber()+" - Числа : "+part.getPlayerNumbers()[0]+" "+part.getPlayerNumbers()[1]+" "+part.getPlayerNumbers()[2]);
        }
    }

    public void WinnerNumbersPrinter(){
        System.out.print("Выигрышные числа: ");
        for(int n:winNumbers) System.out.print(n+" ");
        System.out.println();
    }

    public void PlayerSelect(){
        Scanner scanner = new Scanner(System.in);
        int n;
        ParticipiansPrinter(participiants);
        System.out.println("Выберите игрока: ");
        System.out.print("> ");
        n=scanner.nextInt();
        participiants[n-1].setSelected(true);
        System.out.println("Выбранный вами игрок: "+participiants[n-1].getOrderNumber()+" - Его числа : "+participiants[n-1].getPlayerNumbers()[0]+" "+participiants[n-1].getPlayerNumbers()[1]+" "+participiants[n-1].getPlayerNumbers()[2]);
    }

    public void WinnerSetter(){
        for(Participiant participiant: participiants ){
            int n=0;
            for( int wnum: winNumbers){
                if(wnum==participiant.getPlayerNumbers()[0]||wnum==participiant.getPlayerNumbers()[1]||wnum==participiant.getPlayerNumbers()[2]) n++;
            }
            if(n>2){
                participiant.setWinner(true);
            }
        }
        System.out.println("Игра проведена");
    }

    public void printWinnerPart(){
        boolean selectedIsWinn=false;
        for(Participiant part:participiants){
            if(part.isWinner()){
                System.out.println("Игрок "+part.getOrderNumber()+" Победил!");
                if(part.isSelected()) selectedIsWinn=true;
            }
        }
        if(selectedIsWinn) System.out.println("Поздравляем, выбранный вами игрок победил!");
        else System.out.println("Выбранный вами игрок проиграл.");
    }

}
