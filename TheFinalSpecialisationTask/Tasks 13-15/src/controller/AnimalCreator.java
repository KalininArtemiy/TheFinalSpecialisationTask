package controller;
import java.time.LocalDate;

import model.*;
import userIntrface.*;
public class AnimalCreator {
   
    public static Animal newAnimal(){
        String name = View.getNamefromUser();
        LocalDate birthday = View.getBirthdayfromUser();
        String newAnimalClass = View.ChooseAnimalClass();
        switch (newAnimalClass) {
            case "1":
                String newPetClass = View.ChoosePetClass();
                switch (newPetClass) {
                    case "Cat":
                        PetCat cat = new PetCat(name, birthday, newPetClass);
                        return cat;
                    case "Dog":
                        PetDog dog = new PetDog(name, birthday, newPetClass);
                        return dog;
                    case "Hamster":
                        PetHamster hamster = new PetHamster(name, birthday, newPetClass);
                        return hamster;
                    default:
                        System.out.println("Wrong pet class");
                        return null;
                }
            case "2": 
                String newPackAnimalClass = View.ChoosePackAnimalClass();
                switch (newPackAnimalClass) {
                case "Horse":
                    PackAnimalHorse horse = new PackAnimalHorse(name, birthday, newPackAnimalClass);
                    return horse;
                case "Dog":
                    PackAnimalCamel camel = new PackAnimalCamel(name, birthday, newPackAnimalClass);
                    return camel;
                case "Donkey":
                    PackAnimalDonkey donkey = new PackAnimalDonkey(name, birthday, newPackAnimalClass);
                    return donkey;
                default:
                    System.out.println("Wrong Pack class");
                    return null;
            }
        }
        return null;

    }
   
    



}
