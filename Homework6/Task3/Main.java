package Task3;

import Task3.Devices.*;

import java.util.Scanner;


public class Main {

    public static Device[] DeviceCreator(){
        Device[] devices = new Device[5];
        devices[0] = new Monitor("samsung d32");
        devices[1] = new Monitor("samsung sua3");
        devices[2] = new Printer("hp 107a");
        devices[3] = new Smartphone("Xiaomi Redmi note 4");
        devices[4] = new Smartphone("Samsung galaxy s6");

        return devices;
    }

    public static Device DeviceChooser(Device devices[]){
        for (int i=0;i<devices.length;i++){
            System.out.println(i+"."+devices[i].getInfo());
        }
        System.out.print("Введите номер устройства на котором хотите вывести сообщение: \n> ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return devices[n];
    }

    public static int MessagePrinter(Device d){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: \n> ");
        String s = scanner.nextLine();
        d.print(s);
        System.out.println("1.Продолжить печать\n2.Выбрать другое устройство\n3.Выход");
        int n = scanner.nextInt();
        return n;
    }




    public static void main(String[] args) {
        Device[] devices = DeviceCreator();
        boolean status0=true;
        while(status0){
            Device d = DeviceChooser(devices);
            boolean status = true;
            while(status){
                int n = MessagePrinter(d);
                switch(n){
                    case 1:
                        continue;
                    case 2:
                        status = false;
                        break;
                    case 3:
                        status0=false;
                        status=false;
                        break;
                }
            }
        }
    }
}
