public class Task9 {
    public static void fib(int n){
        if(n==0) return;
        int a1=1;
        int a2=1;
        for(int i=1;i<=n;i++){
            if (i==1) System.out.print(1+" ");
            else if (i==2) System.out.print(1+" ");
            else {
                int cur=a1+a2;
                System.out.print(cur+" ");
                a1=a2;
                a2=cur;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fib(1);
        fib(2);
        fib(5);
        fib(15);
    }

}
