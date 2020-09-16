//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//Dog.java
//Inherited from animal class.

public class Dog extends Animal implements Domesticated{
    Dog(String type, String name, String gender, String environment, int age, double speed){
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

    public void bark(){
        System.out.println(getName() + " is barking!!!");
    }
}
