package Task2.Classes;

public class PermomentEmployee extends Employee {
    private int salaryBonus;

    public PermomentEmployee(String name, int age, int experience, int salary) {
        super(name, age, experience, salary+experience*10);
        this.salaryBonus= experience*10;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
