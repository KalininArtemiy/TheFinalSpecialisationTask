package model;

import java.time.LocalDate;

public class PetDog extends Pet {
    
    public PetDog(String name, LocalDate birthday, double weight, String petClass) {
        super(name, birthday, petClass);
    }
}
