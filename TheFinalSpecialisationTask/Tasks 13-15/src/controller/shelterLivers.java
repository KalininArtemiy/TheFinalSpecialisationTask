package controller;

import java.util.HashMap;
import java.util.Map;

import model.Animal;

public class shelterLivers {
    private Counter counter;
    private HashMap <Integer, Animal> livers;

    public shelterLivers() {
        this.counter = new Counter();
        this.livers = new HashMap<Integer, Animal>();
    }

    public void putNewAnimal(Animal animal){
        this.livers.put(counter.getCount(), animal);
        counter.addCount();
    }

    public void showAllLivers(){
        for (Map.Entry entry: livers.entrySet()){
            System.out.println();
        }

    }
}
