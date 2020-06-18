public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1,7,45,34,89,9,53,92,11,56};
        int min=arr[0];
        int max=arr[0];
        for(int i:arr){
            if(i<min) min=i;
            if(i>max) max=i;
        }
        System.out.println("Минимальное число= "+min);
        System.out.println("Максимальное число= "+max);
    }
}
