//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public class PartTimeHourly extends Employee {
    private double baseHourlyPay;

    PartTimeHourly() {
        super();
        setId(-1);
        baseHourlyPay = -1;
    }

    PartTimeHourly(String firstName, String lastName, Address address, Double pay) {
        super(firstName, lastName, address, -1);
        this.baseHourlyPay = pay;
    }

    public double getHourlyPay() {
        return baseHourlyPay;
    }

    public void setHourlyPay(double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }

    public String toString() {
        return "PartTimeHourly{" +
                "baseHourlyPay= $" + baseHourlyPay +
                '}';
    }

    public void introduce(boolean displaySSN) {
        //Print out all information in the order: Person -> Employee -> PartTimeHourly
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
        System.out.println(this.toString());  //Print PartTimeHourly information.

    }

    public double computePay(int numHrs) {
        //Calculate paycheck = numHrs * baseHourlyPay.
        //If working more than 40 hours return -1.
        if (numHrs > 40) {
            return -1;
        } else {
            return baseHourlyPay * numHrs;
        }
    }
}
