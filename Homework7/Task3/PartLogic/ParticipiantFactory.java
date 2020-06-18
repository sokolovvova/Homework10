package Task3.PartLogic;

import Task3.GS.NumberGenerator;

import java.util.LinkedHashMap;

public class ParticipiantFactory {
    public LinkedHashMap<Integer,Participiant> PartCreator(int numerOfPlayers){
        LinkedHashMap<Integer,Participiant> partList = new LinkedHashMap<>();
        for(int i=0;i<numerOfPlayers;i++){
            partList.put(i+1,new Participiant(NumberGenerator.NumGen(3)));
        }
        return partList;
    }
}
