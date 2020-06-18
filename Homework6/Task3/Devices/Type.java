package Task3.Devices;

public enum Type {
    PRINTER("Принтер"),
    PC_MONITOR("Монитор"),
    SMARTPHONE("Смартфон");

    private String title;

    Type(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }
}
