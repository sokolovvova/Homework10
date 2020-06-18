public class Task8 {
    public static void main(String[] args) {
        int[] arr = {1,7,45,34,89,9,53,92,11,56};

        System.out.print("Исходный массив: ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        double s = sum/10.0;
        System.out.print("среднее арифметическое для всех элементов: "+s);
    }
}
