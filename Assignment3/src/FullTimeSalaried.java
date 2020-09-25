//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public class FullTimeSalaried extends FullTimeEmployee {
    FullTimeSalaried() {
        super();
    }

    FullTimeSalaried(String firstName, String lastName, Address address, Double salary) {
        super(firstName, lastName, address, -1, salary);
    }

    public String toString() {
        return super.toString();
    }

    public void introduce(boolean displaySSN) {
        //Print out all information in the order: Person -> Employee -> FullTimeEmployee -> FullTimeSalaried
        if (displaySSN) {
            super.introduce(); //Call Employee introduce, which print out Person information.
        } else {
            System.out.println("Person{" +
                    "firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age=" + getAge() + '\'' +
                    ", address=" + getAddress() +
                    '}');
        }
        System.out.println(super.toString()); //Print Employee information.
        System.out.println("Base pay: $" + String.format("%.2f", super.getBasePay()));
    }

    public Double computePay(int numWeeks) {
        //Calculate and return full time salaried.
        return super.getBasePay() * (1.0 / 52.0) * numWeeks;
    }

    public Double computePay(double numWeeks) {
        //Calculate and return full time salaried.
        return super.getBasePay() * (1.0 / 52.0) * numWeeks;
    }

}
