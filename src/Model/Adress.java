package Model;

public class Adress {

    private String city;
    private String number;
    private String street;
    private String zipCode;

    public Adress(String city, String number, String street, String zipCode) {
        this.city = city;
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return " "+this.street + " " + this.number + " " + this.zipCode + " " + this.city;
    }
}
