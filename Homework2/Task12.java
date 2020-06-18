public class Task12 {
    public static void main(String[] args) {
        double[] arr = {1.456,7.35,45.334535,34.1,89.67,9.0,53.2,92.88,11.5,11.4};

        System.out.print("Исходный массив: ");
        for(double i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();




        //сортировка по возрастанию
        int min;
        double tmp;
        for(int j=0;j<arr.length;j++){
            min=j;
            for(int i=j;i<arr.length;i++){
                if(arr[min]>arr[i]) min=i;
            }
            tmp=arr[j];
            arr[j]=arr[min];
            arr[min]=tmp;
        }

        System.out.print("Отсортированный по возростанию массив: ");
        for(double i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        //сортировка по убыванию

        int max;
        for(int j=0;j<arr.length;j++){
            max=j;
            for(int i=j;i<arr.length;i++){
                if(arr[max]<arr[i]) max=i;
            }
            tmp=arr[j];
            arr[j]=arr[max];
            arr[max]=tmp;
        }

        System.out.print("Отсортированный по убыванию массив: ");
        for(double i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();


    }
}
