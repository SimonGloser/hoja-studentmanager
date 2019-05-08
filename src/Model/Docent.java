package Model;

public class Docent extends Person {

    public double money;

    public Docent(String name, Adress adress, double money) {
        super(name, adress);
        this.money = money;
    }

    @Override
    public String toString() {
        return super.toString() + " " +  this.money;
    }
}
