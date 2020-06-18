package Task3.GS;

import Task3.PartLogic.Participiant;
import Task3.PartLogic.ParticipiantFactory;

import java.util.*;

public class GameSimulator {

    private ArrayList<Integer> winNumbers;
    private LinkedHashMap<Integer,Participiant> participiants;

    public GameSimulator(){
        winNumbers= new ArrayList<>(NumberGenerator.NumGen(6));
    }

    public void PartListGen(ParticipiantFactory pf){
        Scanner scanner = new Scanner(System.in);
        int partNum;
        LinkedHashMap<Integer,Participiant> list;
        System.out.print("Введите количество игроков: \n>");
        partNum=scanner.nextInt();
        list=pf.PartCreator(partNum);
        this.participiants=list;
    }

    public void ParticipiansPrinter(LinkedHashMap<Integer,Participiant> partList){
        for(int i=1;i<=partList.size();i++){
            System.out.println("Игрок "+i+" - Числа : "+partList.get(i).getPlayerNumbers().get(0)+" "+partList.get(i).getPlayerNumbers().get(1)+" "+partList.get(i).getPlayerNumbers().get(2));
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
        participiants.get(n).setSelected(true);
        System.out.println("Выбранный вами игрок: "+n+" - Его числа : "+participiants.get(n).getPlayerNumbers().get(0)+" "+participiants.get(n).getPlayerNumbers().get(1)+" "+participiants.get(n).getPlayerNumbers().get(2));
    }

    public void WinnerSetter(){
        for(int i=1;i<=participiants.size();i++){
            int n=0;
            for(int j=0;j<winNumbers.size();j++){
                if(winNumbers.get(j)==participiants.get(i).getPlayerNumbers().get(0)||winNumbers.get(j)==participiants.get(i).getPlayerNumbers().get(1)||winNumbers.get(j)==participiants.get(i).getPlayerNumbers().get(2)) n++;
            }
            if(n>2){
                participiants.get(i).setWinner(true);
            }
        }


        System.out.println("Игра проведена");
    }

    public void printWinnerPart(){
        boolean selectedIsWinn=false;

        for(int i=1;i<=participiants.size();i++){
            if(participiants.get(i).isWinner()){
                System.out.println("Игрок "+i+" Победил!");
                if(participiants.get(i).isSelected()) selectedIsWinn=true;
            }
        }
        if(selectedIsWinn) System.out.println("Поздравляем, выбранный вами игрок победил!");
        else System.out.println("Выбранный вами игрок проиграл.");
    }

}
