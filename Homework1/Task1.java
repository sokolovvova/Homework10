/**
 * Задание № 1
 *
 * 1) Написать алгоритмы конвертации физических величин.
 * Код должен быть написан в соответствующих функциях
 * вместо комментария со вловом TODO
 *
 * 2) Написать 2-3 собственные функции по конвертированию величин.
 * Результат вывести в консоль с помощью команды System.out.println().
 * См. Пример ее использования в методе main
 *
 * PS Предусмотреть деление на 0, в этом случае нужно возвращать число -999.
 *
 * Метод проверки: когда запустите метод main и посмотреть результаты в консоли.
 */

public class Task1 {

    public static double meterToInch(double meter) {
        return meter*39.37007;
    }

    public static double inchToMeter(double inch) {
        return inch/39.37007;
    }

    public static double kilogramToGram(double kilogram) {
        return kilogram*1000;
    }

    public static double gramToKilogram(double gram) {
        return gram/1000;
    }

    public static double literToCubicMeter(double liter) {
        return liter/1000;
    }

    public static double cubicMeterToLiter(double liter) {
        return liter*1000;
    }

    public static double meterToKilometer(double meter){
        return meter/1000;
    }

    public static double hourToMinutes(double hour){
        return hour*60;
    }

    public static void main(String[] args) {
        double inch = meterToInch(5);
        System.out.println("meterToInch - 5: " + inch);

        inch = meterToInch(0);
        System.out.println("meterToInch - 0: " + inch);

        double meter = inchToMeter(10);
        System.out.println("inchToMeter - 10: " + meter);

        meter = inchToMeter(0);
        System.out.println("inchToMeter - 0: " + meter);

        double gram = kilogramToGram(13);
        System.out.println("kilogramToGram - 13: " + gram);

        gram = kilogramToGram(0);
        System.out.println("kilogramToGram - 0: " + gram);

        double kilogram = gramToKilogram(991);
        System.out.println("gramToKilogram - 991: " + kilogram);

        kilogram = gramToKilogram(0);
        System.out.println("gramToKilogram - 0: " + kilogram);

        double cubicMeter = literToCubicMeter(88);
        System.out.println("literToCubicMeter - 88: " + cubicMeter);

        cubicMeter = literToCubicMeter(0);
        System.out.println("literToCubicMeter - 0: " + cubicMeter);

        double liter = cubicMeterToLiter(69);
        System.out.println("cubicMeterToLiter - 69: " + liter);

        liter = cubicMeterToLiter(0);
        System.out.println("cubicMeterToLiter - 0: " + liter);

        double kilometer = meterToKilometer(50);
        System.out.println("meterToKilometer - 50: " + kilometer);

        kilometer = meterToKilometer(0);
        System.out.println("meterToKilometer - 0: " + kilometer);

        double minutes = hourToMinutes(1.5);
        System.out.println("hourToMinutes - 1.5: " + minutes);

        minutes = hourToMinutes(0);
        System.out.println("hourToMinutes - 0: " + minutes);
    }
}
