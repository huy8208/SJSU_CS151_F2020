//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//EmployeeTest.java
//This class aims to test Employee class.

public class EmployeeTest {
    public static void main(String[] args) {
        Employee joeSmith = new Employee("Joe","Smith",25,"123-45-1261","555 Exeter ct","Male",150,5124,"contractor",60);
        Employee lisaGray = new Employee("Lisa","Gray",26,"234-56-4334","481 Talbot Drive Newton, NJ 07860","Female",110,5392,"full time",110000);
        Employee timothyBriggs = new Employee("Timothy","Briggs",27,"824-35-6037","9301 Glenwood Dr,El Dorado,AR 71730","Male",180,5412,"full time",80000);
        Employee georgeWallace = new Employee("George","Wallace",28,"836-68-1735","7803 Kingston Dr,Charlottesville, VA 22901","Male",175,5512,"part time",20);
        Employee amyStudent = new Employee("Amy","Student",29,"612-47-5812","549 Sierra St, Marlborough, MA 01752","Female",140,5029,"contractor",45);

        joeSmith.introduce();
        System.out.println("Paycheck:$"+String.format("%.2f",joeSmith.calculatePay(30)));
        System.out.println();

        lisaGray.introduce();
        System.out.println("Paycheck:$"+String.format("%.2f",lisaGray.calculatePay(2)));
        System.out.println();

        timothyBriggs.introduce();
        System.out.println("Paycheck:$"+String.format("%.2f",timothyBriggs.calculatePay(4)));
        System.out.println();

        georgeWallace.introduce();
        System.out.println("Paycheck:$"+String.format("%.2f",georgeWallace.calculatePay(25)));
        System.out.println();

        amyStudent.introduce();
        System.out.println("Paycheck:$"+String.format("%.2f",amyStudent.calculatePay(45)));

    }
}
