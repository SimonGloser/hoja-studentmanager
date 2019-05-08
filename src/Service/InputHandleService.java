package Service;

import Model.Adress;

public class InputHandleService {

    public Adress makeAdress(String input){

        String [] parts = prettySplit(input);

        String city = parts[2];
        String number = parts[3];
        String street = parts[4];
        String zipCode = parts[5];

        return new Adress(city, number, street, zipCode);
    }

    public String splitName(String input){

        String [] parts = prettySplit(input);

        return parts[0] + parts[1];
    }

    public String splitMatrikelNumber(String input){

        String [] parts = prettySplit(input);

        return parts[6];
    }

    private String[] prettySplit(String input){

        return input.split(" ");
    }

    public double moneySplit(String input){
        String [] parts = prettySplit(input);
        double money = Double.parseDouble(parts[6]);
        return money;
    }
}
