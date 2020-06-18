public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1,7,45,34,89,9,53,92,11,56};

        System.out.print("Исходный массив: ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();



        for(int i=1;i<arr.length;i=i+2){
            arr[i]=0;
        }



        System.out.print("Преобразованный массив: ");
        for(int i:arr) {
            System.out.print(i+" ");
        }


    }
}
