package controller;

public class animalCounter {
    private static animalCounter counter;
    private static Integer number = 1;

    private animalCounter(){
    }

 
    public static animalCounter getCounter(){
        if (counter == null){
            counter = new animalCounter();
        }
        return counter;
    }

    public void addCount(){
        ++number;
    }

    public Integer getCount(){
        return number;
    }
}
