/**
 * Задание № 4
 *
 * 1) В переменной min лежит число от 0 до 59.
 * Определите в какую четверть часа попадает это число
 * (в первую, вторую, третью или четвертую).
 *
 * - от 0 до 14 - первая
 * - от 15 до 29 - вторая
 * - от 30 до 44 - третья
 * - от 45 до 59 - четвертая
 * - если число не входит в диапазон, то вывести сообщение об этом
 *
 * Пример пример сообщения:
 * System.out.println("первая")
 *
 * Пример вызова функции в main:
 * checkTimePath(15)
 * checkTimePath(100)
 *
 * 2) В функцию приходит время в виде миллисекунд.
 * Необходимо вывести в консолько сколько в этих миллисекундах
 * часов, минут и секунд. 1секунда = 1000 милиссекунд.
 *
 * Пример вывода:
 * int hours = ...
 * System.out.println("Часы: " + hours)
 */

public class Task4 {

    public static void checkTimePath(int number) {
        if(number>=0&&number<=14) System.out.println("первая");
        else if(number>=15&&number<=29) System.out.println("вторая");
        else if(number>=30&&number<=44) System.out.println("третья");
        else if(number>=45&&number<=59) System.out.println("четвертая");
        else System.out.println("число не входит в диапазон");
    }

    public static void parseMilliseconds(long milliseconds) {
        long hours=0;
        long minutes=0;
        double seconds=0;
        if(milliseconds>=3600000){
            hours=milliseconds/3600000;
            milliseconds-=hours*3600000;
        }
        if(milliseconds>=60000){
            minutes=milliseconds/60000;
            milliseconds-=minutes*60000;
        }
        if(milliseconds>0){
            seconds=milliseconds/1000.0;
        }
        System.out.println("Часы= "+hours+" Минуты= "+minutes+" Секунды= "+seconds);
    }

    public static void main(String[] args) {
        checkTimePath(15);
        checkTimePath(0);
        checkTimePath(44);
        checkTimePath(200);
        parseMilliseconds(78);
        parseMilliseconds(74000);
        parseMilliseconds(67809000);
        parseMilliseconds(0);
    }
}
