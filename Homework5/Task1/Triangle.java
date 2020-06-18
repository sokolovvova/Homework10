package Task1;

public class Triangle extends Figure {
    public Triangle(int[] shapes, double[] angles) {
        super(3, shapes, angles);
    }

    public Triangle() {
    }

    @Override
    void printFigData() {
        System.out.println("Треугольник");
        System.out.print("Стороны - "+ 3 +"[ ");
        for(int l:shapes) System.out.print(l+" ");
        System.out.println("]");

        System.out.print("Углы - "+ 3 +"[ ");
        for(double l:shapes) System.out.print(l+" ");
        System.out.println("]");
    }
}
