import java.util.Scanner;

public class Menu {

    public static int menuDraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Выберите функцию");
        System.out.println("1.Сложение");
        System.out.println("2.Разность");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");
        System.out.println("0.Выход");
        System.out.print("> ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            return i;
        }
        else {
            return -1;
        }
    }

    public static double[] numberGetter(){
        double[] arr = new double[2];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        System.out.print("> ");
        arr[0] = scanner1.nextDouble();
        System.out.println("Введите второе число: ");
        System.out.print("> ");
        arr[1] = scanner1.nextDouble();
        return arr;
    }

    public static int menuDraw2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Ввести другие числа");
        System.out.println("2.Выйти в меню");
        System.out.print("> ");
        int i = scanner.nextInt();
        return i;
    }


    public static void main(String[] args) {
        boolean status=true;
        while(status){
            int n = menuDraw();
            switch (n){
                case 1:
                    double arr1[] = numberGetter();
                    Arithmetic arith1 = new Arithmetic(arr1[0],arr1[1]);
                    arith1.add();
                    continue;

                case 2:
                    double arr2[] = numberGetter();
                    Arithmetic arith2 = new Arithmetic(arr2[0],arr2[1]);
                    arith2.sub();
                    continue;

                case 3:
                    double arr3[] = numberGetter();
                    Arithmetic arith3 = new Arithmetic(arr3[0],arr3[1]);
                    arith3.mult();
                    continue;

                case 4:
                    boolean state2 = true;
                    while(state2){

                        double arr4[] = numberGetter();
                        Arithmetic arith4 = new Arithmetic(arr4[0],arr4[1]);
                        int st = arith4.div();
                        if(st==1) state2=false;
                        else{
                            int a = menuDraw2();
                            if (a!=1) state2=false;
                        }
                    }
                    continue;


                case 0:
                    status=false;
                    break;
                case -1:
                default:
                    System.out.println("введен неверный пункт меню!");
                    System.out.println();
            }
        }
    }
}
