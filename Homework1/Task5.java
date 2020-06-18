/**
 * Задание № 5
 *
 * 1) Написать алгоритм округления числа до целого.
 * Например 2.5 -> 3, 2.6 -> 3, 2.4 -> 2
 *
 * Вызвать функцию в методе main, а результат вывести в консоль
 * Пример вызова:
 * int result = roundNumber(4.45)
 * System.out.println(result)
 *
 * 2) Написать алгоритм получения дробной части числа.
 * То есть, если у меня число 2.75, то я хочу получить 0.75
 *
 */

public class Task5 {

    public static int roundNumber(double number) {
        double d = number%1;
        int i=(int) number;
        if(d>=0.5) i++;
        return i;
    }

    public static double getTail(double number) {
        return number%1;
    }

    public static void main(String[] args) {
        System.out.println(roundNumber(2.5));
        System.out.println(roundNumber(2.6));
        System.out.println(roundNumber(2.4));
        System.out.println(roundNumber(145.89));
        System.out.println(roundNumber(0));
        System.out.println(getTail(2.75));
        System.out.println(getTail(1.00987));
        System.out.println(getTail(1));
        System.out.println(getTail(0));
    }
}
