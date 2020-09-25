//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

// For no parameter constructor. Any numeric values that are not set will be set as either -1(int) or -1.0(double).
// For string, they will be "Default".
// For variables that are not set in parameterized constructor. They will be set as "unset"(string) or -1(numeric values).

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;


    Person() {
        Address defaultAddressOb = new Address();
        this.firstName = "Default";
        this.lastName = "Default";
        this.age = -1;
        this.ssn = "Default";
        this.address = defaultAddressOb;
    }

    Person(String firstName, String lastName, int age, String ssn, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        if (this instanceof Customer) {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age + '\'' +
                    ", address=" + address +
                    '}';
        } else {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", ssn='" + ssn + '\'' +
                    ", address=" + address +
                    '}';
        }

    }

    // Considering remove
    public void introduce() {
        System.out.println(this.toString());
    }

}
