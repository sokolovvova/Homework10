package Task1.Sorting;

public class ShellSort implements Sortable {

    @Override
    public int[] sort(int[] a, int order) {

        if(order==1){
            int tmp;
            int j;
            for(int d=a.length/2;d>0;d=d/2){
                for(int i=d;i<a.length;i++){
                    tmp=a[i];
                    for(j=i;j>=d;j=j-d){
                        if(tmp<a[j-d]) a[j]=a[j-d];
                        else break;
                    }
                    a[j]=tmp;
                }
            }
        }
        else if(order==2){
            int tmp;
            int j;
            for(int d=a.length/2;d>0;d=d/2){
                for(int i=d;i<a.length;i++){
                    tmp=a[i];
                    for(j=i;j>=d;j=j-d){
                        if(tmp>a[j-d]) a[j]=a[j-d];
                        else break;
                    }
                    a[j]=tmp;
                }
            }
        }
        return a;
    }
}
