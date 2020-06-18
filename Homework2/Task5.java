public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1,7,45,34,89,9,53,92,11,56};

        System.out.print("Исходный массив: ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        int tmp;
        for(int i=0;i<arr.length/2;i++){
            tmp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;
        }

        System.out.print("Преобразованный массив: ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
}
