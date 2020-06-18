package Task1;

public class Square  extends Rectangle{
    public Square(int a) {
        super(a, a);
    }

    @Override
    void printFigData() {
        System.out.println("Квадрат");
        System.out.println("Сторона  = "+shapes[0]);
    }
}
