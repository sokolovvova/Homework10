public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1,7,45,34,89,10,53,92,11,56};

        System.out.print("Исходный массив: ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();



        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) arr[i]*=arr[i];
        }



        System.out.print("Преобразованный массив: ");
        for(int i:arr) {
            System.out.print(i+" ");
        }


    }
}
