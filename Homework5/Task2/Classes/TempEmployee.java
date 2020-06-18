package Task2.Classes;

public class TempEmployee extends Employee {
    int numberOfWorkingDays;

    public TempEmployee(String name, int age, int experience, int salary, int numberOfWorkingDays) {
        super(name, age, experience, salary);
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" Количество отработанных дней= "+numberOfWorkingDays);
    }
}
