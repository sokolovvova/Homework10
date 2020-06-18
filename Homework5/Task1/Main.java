package Task1;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(3,new int[]{2,3,2},new double[]{15.0,60.0,35.1});
        Rectangle rectangle = new Rectangle(15,6);
        Square square = new Square(7);
        Triangle triangle = new Triangle(new int[]{3,4,5},new double[]{30.5,45.6,80.5});
        EqTriangle eqTriangle = new EqTriangle(5);

        figure.printFigData();
        System.out.println();
        rectangle.printFigData();
        System.out.println();
        square.printFigData();
        System.out.println();
        triangle.printFigData();
        System.out.println();
        eqTriangle.printFigData();
    }


}
