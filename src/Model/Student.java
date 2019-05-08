package Model;

public class Student extends Person {

    public String number;


    public Student(String name, Adress adress, String number) {
        super(name, adress);
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.number;
    }
}
