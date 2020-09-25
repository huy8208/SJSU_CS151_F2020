//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public abstract class FullTimeEmployee extends Employee {
    private double basePay;

    FullTimeEmployee() {
        super();
        basePay = -1.0;
    }

    FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay) {
        super(firstName, lastName, address, id);
        this.basePay = basePay;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
}
