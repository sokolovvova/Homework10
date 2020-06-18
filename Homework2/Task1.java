public class Task1 {

    public static int sumOfNumbers(int n){
        int i=0;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(0));
        System.out.println(sumOfNumbers(1));
        System.out.println(sumOfNumbers(2));
        System.out.println(sumOfNumbers(5));
        System.out.println(sumOfNumbers(15));
    }


}
