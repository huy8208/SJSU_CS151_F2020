// SJSU-CS151
// Assignment 4
// Duc Huy Nguyen

public class EmployeeTest {
    public static void main(String[] args) {
        Employee johnSmith = new Employee("John","Smith",101,35);
        System.out.println("Paycheck: $"+johnSmith.computePay(40));
        System.out.println("Paycheck: $"+johnSmith.computePay(23));
        System.out.println("Paycheck: $"+johnSmith.computePay(1));
        System.out.println("Paycheck: $"+johnSmith.computePay(0));
        System.out.println("Paycheck: $"+johnSmith.computePay(-5));
//        System.out.println("Paycheck: $"+johnSmith.computePay(41));  //Testing for exceeding working hour limit.

    }
}
