package Task1;

public class Main {

    public static char func(int n){
        if(n==0) System.out.print(n);
        else
            System.out.print(func(n-1)+""+n);
        return ' ';
    }

    public static void main(String[] args) {

        func(33);
    }
}
