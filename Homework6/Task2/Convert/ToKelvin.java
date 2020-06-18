package Task2.Convert;

public class ToKelvin implements Convertable {
    @Override
    public double convert(double d) {
        return d+273.15;
    }
}
