package Task1;

public class EqTriangle extends Triangle {
    public EqTriangle(int s) {
        super(new int[]{s,s,s},new double[]{60.0,60.0,60.0});
    }

    @Override
    void printFigData() {
        System.out.println("Равносторонний треугольник");
        System.out.println("Сторона - "+shapes[0]+" Угол - "+angles[0]);
    }
}
