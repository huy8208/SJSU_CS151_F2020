//SJSU CS-151
//Assignment 5
//Name: Duc Huy Nguyen

public class Person {
    private String firstName,lastName;
    private int age;

    //  Getters
    public int getAge() { return age; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }

    //  Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setAge(int age) { this.age = age; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    //  Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
