package Task4;


import Task4.Classes.Car;
import Task4.Classes.PassengerCar;
import Task4.Classes.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int printMenu(){
        System.out.println("Выберите тип автомобиля: ");
        System.out.print("1 - Грузовые \n2 - Легковые \nЛюбая цифра - выход\n>");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }

    public static void printTrucks(ArrayList<Car> cars){
        for(Car car:cars){
            if(car instanceof Truck){
                ((Truck) car).printInfo();
                System.out.println();
            }
        }
    }

    public static void printPasCar(ArrayList<Car> cars){
        for(Car car:cars){
            if(car instanceof PassengerCar){
                ((PassengerCar) car).printInfo();
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new PassengerCar("Audi","A4",1998,"фиолетовый",4,180));
        cars.add(new PassengerCar("ВАЗ","2107",2010,"синий",5,95));
        cars.add(new PassengerCar("Opel","Ascona",1990,"жёлтый",5,85));
        cars.add(new Truck("Scania","Streamline",2002,"красный",600,2));
        cars.add(new Truck("Renault","Magnum",2010,"белый",800,2));
        cars.add(new Truck("Scania","S",2009,"голубой",1300,3));
        cars.add(new PassengerCar("Chevrolet","Impala",2008,"красный",6,110));
        cars.add(new PassengerCar("Ford","Mondeo",1999,"зелёный",5,100));
        cars.add(new Truck("DAF","XF 105",2005,"голубой",550,2));
        cars.add(new Truck("Mercedes-Benz","SLT",2016,"чёрный",1300,4));
        boolean state = true;

        while(state){
            int n = printMenu();
            switch (n){
                case 1:
                    printTrucks(cars);
                    break;
                case 2:
                    printPasCar(cars);
                    break;
                default:
                    state=false;
            }
        }
    }
}
