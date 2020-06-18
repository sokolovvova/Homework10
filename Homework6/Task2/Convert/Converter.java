package Task2.Convert;

public class Converter {

    public Convertable convertToFarenheit(){
        return new ToFarenheit();
    }

    public Convertable convertToKelvin(){
        return new ToKelvin();
    }

}
