package model;

import java.time.LocalDate;

public class PetCat extends Pet{
   
    public PetCat(String name, LocalDate birthday, double weight, String petClass) {
        super(name, birthday, petClass);
    }
}
