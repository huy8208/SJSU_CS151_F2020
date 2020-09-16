//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//Whale.java
//Inherited from animal class.

public class Whale extends Animal implements Swimmer  {

    Whale(String type, String name, String gender, String environment, int age, double speed){
        super(type, name, gender, environment, age, speed);
    }

    @Override
    public void swim(){
        System.out.println(getName()+" is swimming.");
    }
}
