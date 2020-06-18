/**
 * Задание № 7
 * <p>
 * 1) Даны 3 числа. Вычислить их сумму. Если все три числа равны,
 * то нужно вернуть сумму увеличеннную в два раза
 * <p>
 * 2) Даны 2 числа, нужно вернуть true,
 * если одно из низ равно 10 или их сумма равно 10
 * <p>
 * 3) Даны 3 числа, нужно вернуть максимально число
 * Результат вывести в консоль
 * <p>
 * 4) Даны 3 числа, нужно вернуть минимальное число
 * Результат вывести в консоль
 */

public class Task8 {

    public static int sum1(int a, int b, int c) {
        int sum = a+b+c;
        if(a==b&&a==c) sum*=2;
        return sum;
    }

    public static boolean sum2(int a, int b, int c) {
        int sum = a+b+c;
        if(a==10||b==10||c==10||sum==10){
            return true;
        }
        else return false;
    }

    public static int max(int a, int b, int c) {
        int max =a;
        if (b>max) max=b;
        if (c>max) max =c;
        return max;
    }

    public static int min(int a, int b, int c) {
        int min =a;
        if(b<a) min =b;
        if(c<a) min =c;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(sum1(5,9,14));
        System.out.println(sum1(5,5,5));

        System.out.println(sum2(6,7,3));
        System.out.println(sum2(8,10,3));
        System.out.println((sum2(3,2,5)));

        System.out.println(max(78,45,90));
        System.out.println((max(65,88,13)));

        System.out.println(min(65,34,12));
        System.out.println(min(5,6,5));
    }
}
