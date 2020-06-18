package Task3.Classes;

public class PassengerCar extends Car {
    private int numOfSeats;
    private int maxSpeed;

    public PassengerCar(String brand, String model, int yearOfManufacture, String color, int numOfSeats, int maxSpeed) {
        super(brand, model, yearOfManufacture, color);
        this.numOfSeats = numOfSeats;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print( " | мест для сидения - "+numOfSeats+" | максимальная скорость "+maxSpeed+" км/ч");
    }
}
