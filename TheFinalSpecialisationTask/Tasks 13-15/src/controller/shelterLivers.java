package controller;
import model.*;
import java.util.HashMap;
import java.util.Map;

public class ShelterLivers {
    private static ShelterLivers shelterLivers;
    private static HashMap <Integer, Animal> livers = new HashMap<>();
    
    private ShelterLivers(){
        
    }
    
    public static ShelterLivers getShelter(){
        if (shelterLivers == null){
            shelterLivers = new ShelterLivers();
        }
        return shelterLivers;
    }

    public void addAnimal (Integer index, Animal animal){
        livers.put(index, animal);
    }

    public void showAnimal (){
        for (Map.Entry entry: livers.entrySet()) {
            System.out.println(" ");
            System.out.format("Index of Animal: %s \n%s \n", entry.getKey(), 
            ((Animal) entry.getValue()).AnimaltoString());
         }
    }
    public Integer getSize(){
        return livers.size();
    }
}
