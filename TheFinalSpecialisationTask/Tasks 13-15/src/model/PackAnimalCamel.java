package model;

import java.time.LocalDate;

public abstract class PackAnimalCamel extends PackAnimal{
    
    public PackAnimalCamel(String name, LocalDate birthday, String packAnimalClass) {
        super(name, birthday, packAnimalClass);
    }
    
}
