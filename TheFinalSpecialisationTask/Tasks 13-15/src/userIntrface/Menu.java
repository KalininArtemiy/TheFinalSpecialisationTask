package userIntrface;

import java.util.Scanner;
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
                "\n1 - Show all animals. \n2 - Create new animal. \n3 - Teach new commans. \n0 - Exit.\n");
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
                    if (animal == null){
                        break;
                    }
                    else{
                        livers.addAnimal(counter.getCount(), animal);
                        counter.addCount();
                        break;
                    }
                }catch (Exception e) {
                    System.out.println("Wrong data");
                    break;
                }
                case "3":
                    if (livers.getSize() == 0){
                        System.out.println(" ");
                        System.out.println("No animals");
                        System.out.println(" ");
                        break;
                    }
                    else {
                    livers.showAnimal();
                    System.out.println("Choose animal you want to teach: \n");
                    Integer index = View.getById();
                    if (livers.ContainsKey(index) != null) {
                        Animal teachingAnimal = livers.getByIndex(index);
                        System.out.println("Enter command + enter to add, enter 0 to exit");
                        boolean teaching = true;
                        Scanner teach_command = new Scanner(System.in);
                        while (teaching) {
                            String command = teach_command.next();
                            switch (command) {
                                case "0":
                                    teaching = false;
                                    break;
                                default:
                                    System.out.println("Enter next command or 0 to exit: ");
                                    teachingAnimal.setCommands(command);
                            }
                        }
                    } 
                    else{
                        System.out.println("No such index");
                        break;
                    }
                    break;    
                }
                case "0":
                    flag = false;
                    break;
                default:
                System.out.println("\nIncorrect index: ");
                break;
            }                 
        }       
    }
 }
