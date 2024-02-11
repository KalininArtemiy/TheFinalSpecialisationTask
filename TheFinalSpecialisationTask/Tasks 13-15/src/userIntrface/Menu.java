package userIntrface;

import java.util.Scanner;

import Exceptions.UncorrectDataException;
import model.*;
import controller.AnimalCreator;
import controller.ShelterLivers;
import controller.animalCounter;

public class Menu {
    ShelterLivers livers;
    animalCounter counter;

    public Menu(){
        this.livers = ShelterLivers.getShelter();
        this.counter = animalCounter.getCounter();

    }
    public void start(){
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        while (flag) {
            System.out.println(
                "\n1 -Show all animals. \n2 - Create new animal. \n3 - Animal's commands\n3 - Teach new commans. \n0 - Exit.");
            String key = in.next();
            switch (key) {
                case "1":
                    if (livers.getSize() == 0){
                        System.out.println(" ");
                        System.out.println("No animals");
                        System.out.println(" ");
                        break;
                    }
                    else {
                        livers.showAnimal();
                        break;
                    }
                case "2":
                try{
                    Animal animal = AnimalCreator.newAnimal();
                    livers.addAnimal(counter.getCount(), animal);
                    counter.addCount();
                }catch (UncorrectDataException e) {
                    System.out.println(e.getMessage());
                }
                    break;
                default:
                    break;
            }
        
        }
    }
}
