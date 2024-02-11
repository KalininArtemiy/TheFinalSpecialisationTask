package userIntrface;

import java.time.LocalDate;
import java.util.Scanner;

public class View {
    
    public static String getNamefromUser(){
        System.out.println("\nEnter name: \n");
        Scanner in =  new Scanner(System.in);
        String data = in.nextLine();
        return data;
    }

    public static LocalDate getBirthdayfromUser(){
        try{
            Scanner in =  new Scanner(System.in);
            System.out.println("\nEnter day of birthday: \n");
            Integer day = in.nextInt();
            System.out.println("\nEnter month of birthday: \n");
            Integer month = in.nextInt();
            System.out.println("\nEnter year of birthday: \n");
            Integer year = in.nextInt();
            LocalDate birthday = LocalDate.of(year, month, day);
            return birthday;
        }
        catch (Exception e) {
            System.out.println("-------------------------------------------");
            System.out.println("Wrong date");
            System.out.println("-------------------------------------------");
            return null;
        }
    }
    public static String ChooseAnimalClass(){
        Scanner in =  new Scanner(System.in);
        System.out.println("\nEnter animal class: 1 - Pet, 2 - PackAnimal\n");
        String key = in.nextLine();
        switch (key) {
            case "1":
                return "1";
            case "2":
                return "2";
            default:
                System.out.println("\nWrong animal class\n");
                return null;
        }
    }
    public static String ChoosePetClass(){
        Scanner in =  new Scanner(System.in);
        System.out.println("\nEnter Pet class: 1 - Cat, 2 - Dog, 3 - Hamster\n");
        String key = in.nextLine();
        switch (key) {
            case "1":
                return "Cat";
            case "2":
                return "Dog";
            case "3":
                return "Hamster";
            default:
                System.out.println("\nWrong Pet class\n");
                return null;
        }
    }
    public static String ChoosePackAnimalClass(){
        Scanner in =  new Scanner(System.in);
        System.out.println("\nEnter PackAnimal class: 1 - Horse, 2 - Camel, 3 - Donkey\n");
        String key = in.nextLine();
        switch (key) {
            case "1":
                return "Horse";
            case "2":
                return "Camel";
            case "3":
                return "Donkey";
            default:
                System.out.println("\nWrong PackAnimalClass class\n");
                return null;
        }
    }

    public static Integer getById(){
        Scanner in =  new Scanner(System.in);
        System.out.println("Choose the animal by id\n");
        String key = in.nextLine();
        try {
            Integer number = Integer.parseInt(key);
            return number;
        }
        catch(Exception e){
            System.out.println("-------------------------------------------");
            System.out.println("Wrong index");
            System.out.println("-------------------------------------------");
            return 0;
        }
    }
}
