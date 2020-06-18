package Task2.Classes;

public class Employee extends Applicant{

    private int experience;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int age, int experience, int salary){
        super(name,age);
        this.experience=experience;
        this.salary=salary;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" Стаж работы= "+experience+" Зарплата= "+salary);
    }
}
