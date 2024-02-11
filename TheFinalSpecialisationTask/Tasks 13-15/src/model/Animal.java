package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public abstract class Animal {
    private String name;
    private LocalDate birthday;
    private String animalClass;
    private ArrayList <String> commands;


    public String getName(){
    return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public void setBirthday(LocalDate birthday){
        this.birthday = birthday;
    }

    public String getAnimalClass(){
        return animalClass;
    }

    public void setAnimalClass(String animalClass){
        this.animalClass = animalClass;
    }

    public Animal(String name, LocalDate birthday, String animalClass){
        this.name = name;
        this.birthday = birthday;
        this.animalClass = animalClass;
        this.commands = new ArrayList<>();
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(String command) {
        commands.add(command);
    }

    public String AnimaltoString(){
        return  String.format(
                Locale.getDefault(),
                """
                        Name: %s\s
                        Age: %s\s
                        Genus: %s\s
                        Commands: %s\s
                        """,
                this.name,this.birthday, this.animalClass, this.commands);
    }
}
