public class Arithmetic {

    double a;
    double b;

    public Arithmetic(double a, double b){
        this.a=a;
        this.b=b;
    }

    void add(){
        double result = a+b;
        System.out.println("Результат равен "+result);
    }

    void sub(){
        double result = a-b;
        System.out.println("Результат равен "+result);
    }

    void mult(){
        double result = a*b;
        System.out.println("Результат равен "+result);
    }

    int div(){
        if(b==0) {
            System.out.println("Делить на 0 нельзя");
            return -1;
        }
        else {
            double result = a/b;
            System.out.println("Результат равен "+result);
            return 1;
        }
    }

}
