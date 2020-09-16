//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//Animal.java
//This class provides basic footprints to create an animal.

public class Animal {
    private String type, name, gender, environment;
    private int age;
    private double speed;

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    Animal(String type, String name, String gender, String environment, int age, double speed){
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.environment = environment;
        this.age = age;
        this.speed = speed;
    }

    public void move(){
        System.out.println(getName() + " is moving.");
    }

    public void sound(){
        System.out.println(getName() + " is making a sound.");
    }

    public void eat(){
        System.out.println(getName() + " is eating.");
    }

    public void sleep(){
        System.out.println(getName() + " is sleeping.");
    }

    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", environment='" + environment + '\'' +
                ", age=" + age +
                ", speed=" + speed + "miles/hr)"+
                '}';
    }
}

