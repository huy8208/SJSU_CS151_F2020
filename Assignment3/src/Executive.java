//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public class Executive extends Employee {
    private double yearlyBonus;
    private double yearlyCompensation;

    Executive() {
        super();
        yearlyBonus = -1.0;
        yearlyCompensation = -1.0;
    }

    Executive(String firstName, String lastName, Address address, int id, double yearlyCompensation, double bonus) {
        super(firstName, lastName, address, id);
        this.yearlyCompensation = yearlyCompensation;
        this.yearlyBonus = bonus;
    }

    public double getBonus() {
        return yearlyBonus;
    }

    public void setBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public String toString() {
        return "Executive{" +
                "yearlyBonus= $" + String.format("%.2f", yearlyBonus) +
                ", yearlyCompensation= $" + String.format("%.2f", yearlyCompensation) +
                '}';
    }

    public void introduce(boolean displaySSN) {
        //Print out all information in the order: Person -> Employee -> Executive
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
        System.out.println(this.toString());  //Print Executive information.
    }


    public double computePay() {
        //Compute and return executive paycheck.
        return yearlyBonus + yearlyCompensation;
    }

}
