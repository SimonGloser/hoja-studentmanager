package Model;

public class Person {
    public String name;
    public Adress adress;

    public Person(String name, Adress adress) {
        this.adress = adress;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + " " + this.adress.toString();
    }


}
