package PartLogic;

import GS.NumberGenerator;

public class ParticipiantFactory {
    public Participiant[] PartCreator(int numerOfPlayers){
        Participiant[] partList = new Participiant[numerOfPlayers];
        for(int i=0;i<numerOfPlayers;i++){
            partList[i]=new Participiant(NumberGenerator.NumGen(3),i+1);
        }
        return partList;
    }
}
