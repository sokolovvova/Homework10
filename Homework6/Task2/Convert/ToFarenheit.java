package Task2.Convert;

public class ToFarenheit implements Convertable {
    @Override
    public double convert(double d) {
        return (9.0/5.0)*d+32.0;
    }
}
