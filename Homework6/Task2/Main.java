package Task2;

import Task2.Convert.Converter;

import java.util.Scanner;

public class Main {

    public static double getCelsius(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: \n> ");
        return scanner.nextDouble();
    }

    public static boolean menu(){
        boolean state=true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1 - градусы Цельсия - Фаренгейты\n2 - градусы Цельсия - Кельвины\n0 - Выход\n> ");
        int n = scanner.nextInt();
        Converter converter = new Converter();
        double d,answer;
        switch(n){
            case 1:
                d = getCelsius();
                answer = converter.convertToFarenheit().convert(d);
                System.out.println("Ответ: "+answer);
                state = true;
                break;
            case 2:
                d = getCelsius();
                answer = converter.convertToKelvin().convert(d);
                System.out.println("Ответ: "+answer);
                state = true;
                break;
            case 0:
                state = false;
        }
        return state;

    }

    public static void main(String[] args) {
        boolean state=true;
        while(state){
            state=menu();
        }
    }
}
