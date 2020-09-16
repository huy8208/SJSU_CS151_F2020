//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//AnimalTest.java
// This class aims to test all classes that inherit from Animal Class.

public class AnimalTest {
    public static void main(String[] args) {
//        String type, String name, String gender, String environment, int age, double speed
        Dog lucky = new Dog("Dog","Lucky","Male","Home",11,10.0);
        System.out.println(lucky);
        lucky.greetHuman();
        lucky.walk();
        lucky.eat();
        lucky.move();
        lucky.sleep();
        lucky.sound();
        lucky.bark();
        System.out.println();

        Cat meowMeow = new Cat("Cat","Kitty","Female","Home",1,7.0);
        System.out.println(meowMeow);
        meowMeow.greetHuman();
        meowMeow.walk();
        meowMeow.eat();
        meowMeow.move();
        meowMeow.sleep();
        meowMeow.sound();
        meowMeow.scratch();
        System.out.println();


        Racoon rocket = new Racoon("Racoon","Rocket","Male","Space",50,225.0);
        System.out.println(rocket);
        rocket.eat();
        rocket.move();
        rocket.sleep();
        rocket.sound();
        rocket.scratch();
        System.out.println();

        Whale deepBlue = new Whale("Whale","Deep Blue","Female","Ocean",150,34.0);
        System.out.println(deepBlue);
        deepBlue.eat();
        deepBlue.move();
        deepBlue.sleep();
        deepBlue.sound();
        deepBlue.swim();

    }
}
