package Task1;

public class Figure {
    int numOfShapes;
    int numOfAngles;
    int[] shapes;
    double[] angles;

    public Figure(int numOfShapes, int[] shapes, double[] angles) {
        this.numOfShapes = numOfShapes;
        this.numOfAngles = numOfShapes;
        this.shapes = shapes;
        this.angles = angles;
    }

    public Figure() {
    }

    void printFigData(){
        System.out.println("Фигура");
        System.out.print("Стороны - "+ numOfShapes +"[ ");
        for(int l:shapes) System.out.print(l+" ");
        System.out.println("]");

        System.out.print("Углы - "+ numOfAngles +"[ ");
        for(double l:shapes) System.out.print(l+" ");
        System.out.println("]");
    }
}


