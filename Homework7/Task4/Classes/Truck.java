package Task4.Classes;

public class Truck extends Car {
    private int fuelTank;
    private int numOfAxes;

    public Truck(String brand, String model, int yearOfManufacture, String color, int fuelTank, int numOfAxes) {
        super(brand, model, yearOfManufacture, color);
        this.fuelTank = fuelTank;
        this.numOfAxes = numOfAxes;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" | "+numOfAxes+"-осный"+" | объем бака "+fuelTank+" литров");
    }
}
