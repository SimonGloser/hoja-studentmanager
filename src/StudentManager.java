import Model.Adress;
import Model.Docent;
import Model.Person;
import Model.Student;
import Service.InputHandleService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private static ArrayList<Person> persons = new ArrayList<Person>();


    public static void main(String[] args) {

        readStudentsFromConsole();
        readDocentsFromConsole();
        System.out.println("Number of studends: " + countStudents());
        printAll();
    }

    public static void readStudentsFromConsole(){
        InputHandleService inputHandleService = new InputHandleService();
        Scanner sc = new Scanner(System.in);
        String input;
        String[] parts;
        boolean quit = false;
        System.out.println("Bitte Student eingeben:");
        System.out.println("name, city, number, street, zipCode, matrikel");
        while(!quit){
            input = sc.nextLine();
            if(input.equals("stop")){
                quit = true;
            }else {

                String name = inputHandleService.splitName(input);

                Adress adress = inputHandleService.makeAdress( input );

                String matrikel = inputHandleService.splitMatrikelNumber(input);

                persons.add(new Student(name, adress, matrikel));

                System.out.println("Student gespeichert");
            }
        };
    }

    public static int countStudents(){
        int count = 0;
        for (Person person: persons) {
            if (person instanceof Student){
                count++;
            }
        }
        return count;
    }

    public static void readDocentsFromConsole(){
        InputHandleService inputHandleService = new InputHandleService();
        Scanner sc = new Scanner(System.in);
        String input;
        boolean quit = false;
        System.out.println("Bitte Dozent eingeben:");
        System.out.println("name, city, number, street, zipCode, money");

        while(!quit){
            input = sc.nextLine();
            if(input.equals("stop")){
                quit = true;
            }else {

                String name = inputHandleService.splitName(input);

                Adress adress = inputHandleService.makeAdress( input );

                double money = inputHandleService.moneySplit(input);

                persons.add(new Docent(name, adress, money));

                System.out.println("Dozent gespeichert");
            }
        };
    }

    public static void printAll(){
        for (Person person: persons) {
            System.out.println(person.toString());
        }
    }
}
