package GS;

import java.util.Random;

public class NumberGenerator {

    public static int[] NumGen(int arraySize){
        Random random = new Random();
        int[] array = new int[arraySize];
        int n=0;
        int curRand=random.nextInt(49);
        while(n<arraySize-1){
            if (n==0) array[0] = curRand;
            curRand = random.nextInt(49);
            boolean isRepeated=false;
            for(int i=0;i<=n;i++){
                if (array[i]==curRand) isRepeated=true;
            }
            if(isRepeated) continue;
            else {
                n++;
                array[n]=curRand;
            }
        }

        for(int i=0;i<arraySize;i++) array[i]++;

        return array;
    }
}
