public class Task11 {
    public static void main(String[] args) {
        double[] arr = {1.456,7.35,45.334535,34.1,89.67,9.0,53.2,92.88,11.5,11.4};

        System.out.print("Исходный массив: ");
        for(double i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();




        //сортировка по возрастанию
        int length=arr.length-1;
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<length;i++){
                if(arr[i]>arr[i+1]){
                    double tmp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }
            }
            length--;
        }

        System.out.print("Отсортированный по возростанию массив: ");
        for(double i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        //сортировка по убыванию
        length=arr.length-1;
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<length;i++){
                if(arr[i]<arr[i+1]){
                    double tmp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }
            }
            length--;
        }

        System.out.print("Отсортированный по убыванию массив: ");
        for(double i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();


    }
}
