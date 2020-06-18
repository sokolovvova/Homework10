package Task2.Classes;

public class Applicant {
    private String name;
    private int age;

    public Applicant() {
    }

    public Applicant(String name, int age){
        this.name=name;
        this.age=age;
    }


    public void printInfo(){
        System.out.print("Имя= "+name+" Возраст= "+age);
    }
}

