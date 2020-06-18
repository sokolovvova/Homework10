/**
 * Задание № 2
 *
 * 1) Написать алгоритм проверки числа на четность.
 * в методе main вывести сообщение:
 * - System.out.println("Четное"), если введенное число было четным,
 * то есть функция вернула true
 * - System.out.println("Нечетное"), если введенное число было нечетным,
 * то есть функция вернула false
 *
 * 2) Написать фукнцию расчета среднего числа между 4-мя значениями.
 * Результат вывести в консоль в main
 *
 * 3) переделайте код метода clearOperator1() так,
 * чтобы использовались операции +=, -=, *=, /=.
 * Количество строк кода при этом не должно измениться.
 *
 * 4) Переделайте этот код метода clearOperator2(),
 * чтобы в нем использовались операции ++ и --.
 * Количество строк кода при этом не должно измениться.
 *
 * 5) Вычислить выражения (записать в пригодной для java форме):
 * знак "/" - дробь. Вычисления можно сделать либо отдельной функцией,
 * либо в методе main.
 *
 * a) (1/4 + 5/8 - 1) * 9 - 3
 * b) 9 + 3.6 + (33/(48*5/3))
 * c) 10 * 1/2 + (48*5/3)
 *
 */

public class Task2 {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static double getAvgNumber(int x, int y, int z, int l) {
        return (x + y + l + z)/4.0;
    }

    public static void clearOperator1() {
        int num = 47;
        num += 7;
        num -= 18;
        num *= 10;
        num /= 15;
        System.out.println("clearOperator1" + num);
    }

    public static void clearOperator2() {
        int num = 47;
        num++;
        num--;
        num++;
        num--;
        System.out.println("clearOperator1" + num);
    }

    public static void main(String[] args) {
        int a =0;
        if(isEvenNumber(a)) System.out.println("Чётное");
        else System.out.println("Нечётное");

        int x=20; int y=5; int z=10; int l = 0;
        System.out.println("среднее= "+getAvgNumber(x,y,z,l));

        clearOperator1();

        clearOperator2();

        double a1 = (1.0/4.0+5.0/8.0-1)*9.0-3.0;
        System.out.println("a) "+a1);
        double b1 = 9.0+3.6+(33.0/(48.0*5.0/3.0));
        System.out.println("b) "+b1);
        double c1 = 10.0*1.0/2.0+(48.0*5.0/3.0);
        System.out.println("c) "+c1);

    }
}
