//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//Person.java
//This class provides basic footprints to create a person.

public class Person {
    private String firstName,lastName,address,gender,ssn;
    private int age;
    private double weight;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public String getSsn(){
        return ssn;
    }
    public double getWeight(){
        return weight;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    Person(){
        this.firstName = "default";
        this.lastName = "default";
        this.address = "default";
        this.gender = "default";
        this.age = -1;
        this.ssn = "default";
        this.weight = -1f;
    }

    Person(String firstName,String lastName,int age,String ssn,String address,String gender,double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.ssn = ssn;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return firstName +" "+ lastName +" |Ssn:"+ssn+ " |Age:"+age+" |Sex:"+gender+" |Weight:"+weight+" pounds.\nAddress:"+address+".";
    }

    public void introduce(){
        System.out.println(this.toString());
    }

}

