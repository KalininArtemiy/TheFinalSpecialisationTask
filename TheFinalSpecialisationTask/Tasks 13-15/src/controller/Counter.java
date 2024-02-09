package controller;

public class Counter {
    private Integer count;

    public Counter(){
        this.count = 1;
    }

    public void addCount(){
        this.count++;
    }

    public Integer getCount(){
        return this.count;
    }
}
