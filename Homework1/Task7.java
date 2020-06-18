/**
 * Задание № 7
 *
 * 1) Написать функцию определения количества дней месяца месяца по его номеру.
 * То есть, в функцию будет подано число. Если это число находится
 * в диапазоне 1 - 12, то нам нужно соответствующее количество дне для месяца и
 * его название.
 * Если же было введено число, которое не попадает в заданный диапазон,
 * то нужно вывести сообщение с ошибкой ("Число не в диапазоне").
 *
 * Решение должно быть представлено в двух вариантах в отдельных функциях:
 * - с использованием if-else.
 * Подсказка: можно несколько раз использовать логическое "ИЛИ"(||)
 * - с использованием switch-case
 *
 * 2) Произвести вызов функций в main
 *
 *  Пример вызова:
 *  printMonthWithIfElse(12)
 *  printMonthWithIfElse(44)
 */

public class Task7 {

    public static void printDaysInMonthWithIfElse(int monthNumber) {
        if(monthNumber==2) System.out.println("В месяце 29 дней");
        else if (monthNumber==6||monthNumber==9||monthNumber==11) System.out.println("В месяце 30 дней");
        else if (monthNumber>=1&&monthNumber<=12) System.out.println("В месяце 31 день");
        else System.out.println("Число не в диапазоне");
    }

    public static void printDaysInMonthWithSwithCase(int monthNumber) {
        switch (monthNumber) {
            case 2:
                System.out.println("В месяце 29 дней");
                break;
            case 6:
            case 9:
            case 11:
                System.out.println("В месяце 30 дней");
                break;
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В месяце 31 день");
                break;
            default:
                System.out.println("Число не в диапазоне");
        }
    }
    public static void main(String[] args) {
        printDaysInMonthWithIfElse(9);
        printDaysInMonthWithIfElse(7);
        printDaysInMonthWithIfElse(12);
        printDaysInMonthWithIfElse(13);
        printDaysInMonthWithIfElse(2);

        printDaysInMonthWithSwithCase(9);
        printDaysInMonthWithSwithCase(7);
        printDaysInMonthWithSwithCase(12);
        printDaysInMonthWithSwithCase(13);
        printDaysInMonthWithSwithCase(2);
    }
}
