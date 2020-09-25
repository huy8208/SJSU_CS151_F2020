//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public class FullTimeHourly extends FullTimeEmployee {
    private Double overtimePay;

    FullTimeHourly() {
        super();
        overtimePay = -1.0;
    }

    FullTimeHourly(String firstName, String lastName, Address address, int id, Double basePay, Double overtime) {
        super(firstName, lastName, address, id, basePay);
        this.overtimePay = overtime;
    }

    public Double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertime(Double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public String toString() {
        return "FullTimeHourly{" +
                "overtimePay=" + overtimePay +
                '}';
    }

    public void introduce(boolean displaySSN) {
        //Print out all information in the order: Person -> Employee -> FullTimeEmployee -> FullTimeHourly
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
        System.out.println("Base Pay: $" + super.getBasePay());
        System.out.println("Overtime Pay: $" + overtimePay);
    }

    public double computePay(int numHrs) {
        //Calculate and return full time hourly pay.
        //Assuming that overtime pay is the amount of money, not working hours.
        return ((double) numHrs * getBasePay()) + overtimePay;
    }
}
