// SJSU-CS151
// Assignment 4
// Duc Huy Nguyen

public class Employee {
    private String firstName,lastName;
    private int id;
    private double hourlyPay;

    Employee(String firstName, String lastName,int id,double hourlyPay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    //Getters
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getId() {return id;}
    public double getHourlyPay() {return hourlyPay;}

    //Setters
    public void setId(int id) {this.id = id;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setHourlyPay(double hourlyPay) {this.hourlyPay = hourlyPay;}

    public double computePay(int numberOfHours) {
        try{
            if (numberOfHours < 0){
                throw new NumberFormatException("Can't have negative working hours!");
            }
            if (numberOfHours > 40){
                throw new TooManyHoursWorkedException("Your working hours has exceeded 40 working hours limit!");
            }
            return numberOfHours*hourlyPay;
        }
        catch(TooManyHoursWorkedException | NumberFormatException e){
            System.out.println(e);
            return -1;
        }
    }
}
