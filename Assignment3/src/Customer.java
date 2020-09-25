//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public class Customer extends Person {
    private int customerID;
    private String paymentPreference;

    Customer(String firstName, String lastName, int age, String ssn, Address address, int customerID, String paymentPreference) {
        super(firstName, lastName, age, ssn, address);
        this.customerID = customerID;
        this.paymentPreference = paymentPreference;
    }

    public int getID() {
        return customerID;
    }

    public void setID(int customerID) {
        this.customerID = customerID;
    }

    public String getPayPreference() {
        return paymentPreference;
    }

    public void setPayPreference(String paymentPreference) {
        this.paymentPreference = paymentPreference;
    }

    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", paymentPreference='" + paymentPreference + '\'' +
                '}';
    }

    public void introduce() {
        //Print out customer information.
        System.out.println(super.toString());
        System.out.println(this.toString());
    }


    public void makePayment() {
        //Print out customer preferred payment method.
        System.out.println("Preferred payment method:" + paymentPreference);
    }

}


