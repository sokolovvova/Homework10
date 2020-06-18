public class Task3 {

    public static int maxDevider(int n){
        int md=1;
        if (n==1) return md;
        else{
            for(int i=1;i<n;i++){
                if(n%i==0&&i>md) md=i;
            }
        }
        return md;
    }


    public static void main(String[] args) {
        System.out.println(maxDevider(1));
        System.out.println(maxDevider(2));
        System.out.println(maxDevider(9));
        System.out.println(maxDevider(99));
        System.out.println(maxDevider(78));

    }
}
