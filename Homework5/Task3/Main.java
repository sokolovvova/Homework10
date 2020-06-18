package Task3;


import Task3.Classes.Car;
import Task3.Classes.PassengerCar;
import Task3.Classes.Truck;

import java.util.Scanner;

public class Main {

    public static int printMenu(){
        System.out.println("Выберите тип автомобиля: ");
        System.out.print("1 - Грузовые \n2 - Легковые \nЛюбая цифра - выход\n>");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }


    public static void main(String[] args) {
        Car[] cars = new Car[10];
        cars[0] = new PassengerCar("Audi","A4",1998,"фиолетовый",4,180);
        cars[1] = new PassengerCar("ВАЗ","2107",2010,"синий",5,95);
        cars[2] = new PassengerCar("Opel","Ascona",1990,"жёлтый",5,85);
        cars[3] = new Truck("Scania","Streamline",2002,"красный",600,2);
        cars[4] = new Truck("Renault","Magnum",2010,"белый",800,2);
        cars[5] = new Truck("Scania","S",2009,"голубой",1300,3);
        cars[6] = new PassengerCar("Chevrolet","Impala",2008,"красный",6,110);
        cars[7] = new PassengerCar("Ford","Mondeo",1999,"зелёный",5,100);
        cars[8] = new Truck("DAF","XF 105",2005,"голубой",550,2);
        cars[9] = new Truck("Mercedes-Benz","SLT",2016,"чёрный",1300,4);

        boolean state = true;

        while(state){
            int n = printMenu();
            switch (n){
                case 1:
                    for(Car car:cars){
                            Truck t = car instanceof Truck ? ((Truck) car) : null;
                            if (t!=null) {
                                t.printInfo();
                                System.out.println();}
                    }
                    break;
                case 2:
                    for(Car car:cars){
                        PassengerCar p = car instanceof PassengerCar ? ((PassengerCar) car) : null;
                        if (p!=null) {
                            p.printInfo();
                            System.out.println();}
                    }
                    break;
                default:
                    state=false;
            }

        }
    }
}
