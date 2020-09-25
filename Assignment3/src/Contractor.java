//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public class Contractor extends Employee {
    private double basePay;

    Contractor() {
        super();
        this.basePay = -1.0;
    }

    Contractor(String firstName, String lastName, Address address, double pay, int id) {
        super(firstName, lastName, address, id);
        this.basePay = pay;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public String toString() {
        return "Contractor{" +
                "basePay= $" + basePay +
                '}';
    }

    public void introduce(boolean displaySSN) {
        //Print out all information in the order: Person -> Employee -> Contractor
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
        System.out.println(this.toString());  //Print Contractor information.

    }

    public double computePay(int numHrs) {
        //Take numHrs as number of hours and multiply basePay to get Paycheck
        return numHrs * basePay;
    }

}
