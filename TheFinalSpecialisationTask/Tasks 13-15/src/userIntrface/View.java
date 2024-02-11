package userIntrface;

import java.time.LocalDate;
import java.util.Scanner;

import Exceptions.UncorrectDataException;

public class View {
    
    public static String getNamefromUser(){
        System.out.println("Enter name: ");
        Scanner in =  new Scanner(System.in);
        String data = in.nextLine();
        return data;
    }

    public static LocalDate getBirthdayfromUser(){
        try{
            Scanner in =  new Scanner(System.in);
            System.out.println("Enter day of birthday: ");
            Integer day = in.nextInt();
            System.out.println("Enter month of birthday: ");
            Integer month = in.nextInt();
            System.out.println("Enter year of birthday: ");
            Integer year = in.nextInt();
            LocalDate birthday = LocalDate.of(year, month, day);
            return birthday;
        }
        catch (UncorrectDataException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public static String ChooseAnimalClass(){
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter animal class: 1 - Pet, 2 - PackAnimal");
        String key = in.nextLine();
        switch (key) {
            case "1":
                return "1";
            case "2":
                return "2";
            default:
                System.out.println("Wrong animal class");
                return null;
        }
    }
    public static String ChoosePetClass(){
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter Pet class: 1 - Cat, 2 - Dog, 3 - Hamster");
        String key = in.nextLine();
        switch (key) {
            case "1":
                return "Cat";
            case "2":
                return "Dog";
            case "3":
                return "Hamster";
            default:
                System.out.println("Wrong Pet class");
                return null;
        }
    }
    public static String ChoosePackAnimalClass(){
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter PackAnimal class: 1 - Horse, 2 - Camel, 3 - Donkey");
        String key = in.nextLine();
        switch (key) {
            case "1":
                return "Horse";
            case "2":
                return "Camel";
            case "3":
                return "Donkey";
            default:
                System.out.println("Wrong PackAnimalClass class");
                return null;
        }
    }
    
}
