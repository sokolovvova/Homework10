package Task1.Sorting;

public class SelectionSort implements Sortable {

    @Override
    public int[] sort(int[] a, int order) {
        int min;
        int max;
        int tmp;
        if(order==1){
            for(int i=0;i<a.length;i++){
                min=i;
                for(int j=i;j<a.length;j++){
                    if(a[min]>a[j]){
                        min=j;
                    }
                }
                tmp=a[i];
                a[i]=a[min];
                a[min]=tmp;
            }
        }
        else if(order==2){
            for(int i=0;i<a.length;i++){
                max=i;
                for(int j=i;j<a.length;j++){
                    if(a[max]<a[j]){
                        max=j;
                    }
                }
                tmp=a[i];
                a[i]=a[max];
                a[max]=tmp;
            }

        }
        return a;
    }
}
