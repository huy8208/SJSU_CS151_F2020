//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//Cat.java
//Inherited from animal class.

public class Cat extends Animal implements Domesticated,Scratcher{
    Cat(String type, String name, String gender, String environment, int age, double speed){
        super(type, name, gender, environment, age, speed);
    }

    @Override
    public void walk(){
        System.out.println(getName() + " is walking.");
    }
    @Override
    public void greetHuman(){
        System.out.println(getName() + " greets human.");
    }
    @Override
    public void scratch(){
        System.out.println(getName()+ " scratches human.");
    }
}
