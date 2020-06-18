package Task3.GS;

import java.util.HashSet;
import java.util.Random;

public class NumberGenerator {

    public static HashSet<Integer> NumGen(int arraySize){
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        while(set.size()<arraySize){
            int curRand = random.nextInt(49)+1;
            set.add(curRand);
        }
        return set;
    }
}
