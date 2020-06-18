package Task2;

import Task2.Classes.*;

public class Main {
    public static void main(String[] args) {
        Applicant applicant = new Applicant("Ivan",22);
        Employee employee = new Employee("Dmitriy",25,2,300);
        Trainee trainee = new Trainee("Maxim",29,true);
        TempEmployee tempEmployee = new TempEmployee("Ivan",25,1,75,23);
        PermomentEmployee permomentEmployee = new PermomentEmployee("Kiril",32,8,300);


        System.out.println("Соискатель:");
        applicant.printInfo();
        System.out.println();
        System.out.println("Работник: ");
        employee.printInfo();
        System.out.println();
        System.out.println("Стажер: ");
        trainee.printInfo();
        System.out.println();
        System.out.println("Временный работник: ");
        tempEmployee.printInfo();
        System.out.println();
        System.out.println("Постоянный работник: ");
        permomentEmployee.printInfo();
    }
}
