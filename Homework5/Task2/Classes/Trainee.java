package Task2.Classes;

public class Trainee extends Employee {
    private boolean possobilityOfPromotion;

    public Trainee(String name, int age, boolean possobilityOfPromotion) {
        super(name, age, 0, 50);
        this.possobilityOfPromotion = possobilityOfPromotion;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" Возможность повышения= "+possobilityOfPromotion);
    }
}
