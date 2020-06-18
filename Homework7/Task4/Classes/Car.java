package Task4.Classes;

public abstract class  Car {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String color;

    public Car(String brand, String model, int yearOfManufacture, String color) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
    }

    public void printInfo(){
        System.out.print(brand+" "+model+" "+yearOfManufacture+" года выпуска | цвет "+color);
    }
}
