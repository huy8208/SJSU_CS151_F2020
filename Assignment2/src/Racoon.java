//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//Racoon.java
//Inherited from animal class.

public class Racoon extends Animal implements Scratcher {
    Racoon(String type, String name, String gender, String environment, int age, double speed){
        super(type, name, gender, environment, age, speed);
    }

    @Override
    public void scratch(){
        System.out.println(getName()+" scratches human.");
    }
}
