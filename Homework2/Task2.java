public class Task2 {

    public static int exponent(int number, int degree){
        int answer=1;
        if(degree==0) return answer;
        else if (degree == 1) return number;
        else {
            answer=number;
            for(int i=0;i<degree-1;i++){
                answer*=number;
            }
            return answer;
        }

        }

    public static void main(String[] args) {
        System.out.println(exponent(0,0));
        System.out.println(exponent(78,0));
        System.out.println(exponent(5,1));
        System.out.println(exponent(0,5));
        System.out.println(exponent(5,1));
        System.out.println(exponent(-5,3));
        System.out.println(exponent(5,3));
        System.out.println(exponent(5,4));
    }
}
