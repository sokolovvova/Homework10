public class Task10 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4,5},{8,9,7,0},{6,6,4,3}};
        for(int[] a:arr){
            for(int el:a){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
