package Task1;

public class Rectangle extends Figure {

    public Rectangle(int a,int b) {
        super(4, new int[]{a,a,b,b}, new double[]{90.0,90.0,90.0,90.0});
    }

    public Rectangle() {
    }

    @Override
    void printFigData() {
        System.out.println("Прямоугольник");
        System.out.println("Сторона a = "+shapes[0]+" Сторона b = "+shapes[2]);
    }
}

