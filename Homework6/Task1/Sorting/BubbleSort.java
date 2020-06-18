package Task1.Sorting;

public class BubbleSort implements Sortable {

    public BubbleSort() {
    }

    @Override
    public int[] sort(int[] a, int order) {
        int tmp;
        if(order==1){
            for(int i=a.length-2;i>=0;i--){
                for(int j=0;j<=i;j++){
                    if(a[j]>a[j+1]){
                        tmp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                }
            }
        }
        else if(order==2){
            for(int i=a.length-2;i>=0;i--){
                for(int j=0;j<=i;j++){
                    if(a[j]<a[j+1]){
                        tmp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                }
            }
        }
        return a;
    }
}
