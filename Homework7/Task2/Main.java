package Task2;

public class Main {
    public static void func (int n){
        if(n<10) System.out.println(n);
        else {
            System.out.print(n%10);
            func(n/10);
        }
    }

    public static void main(String[] args) {
        func(123456);
        func(123);
        func(6);
        func(788743452);
    }

}
