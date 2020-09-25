//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public class BusinessTest {
    public static void main(String[] args) {

        System.out.println("Executive Class");
        Executive ElonMusk = new Executive("Elon", "Musk", new Address(3500, "Deer Creek", "Palo Alto", "94020", "CA"), 3, 23760.0, 55000000.0);
        ElonMusk.introduce(true);
        System.out.println("Paycheck: $" + String.format("%.2f", ElonMusk.computePay()));
        System.out.println();

        Executive steveJob = new Executive("Steve", "Job", new Address(2101, "Waverley Street", "Palo Alto", "94020", "CA"), 1, 2000000, 43511534.0);
        steveJob.introduce(false);
        System.out.println("Paycheck: $" + String.format("%.2f", steveJob.computePay()));
        System.out.println();


        System.out.println("FullTimeSalaried Class");
        FullTimeSalaried averageJohn = new FullTimeSalaried("Average", "John", new Address(123, "Dien Bien Phu", "Pataya", "70000", "TL"), 51240.0);
        averageJohn.introduce(true);
        System.out.println("Paycheck: $" + String.format("%.2f", averageJohn.computePay(3)));
        System.out.println();

        FullTimeSalaried linusTorvalds = new FullTimeSalaried("Linus", "Torvalds", new Address(1316, "SW Corbett Hill Cir", "Portland", "91203", "PL"), 210000.0);
        linusTorvalds.introduce(false);
        System.out.println("Paycheck: $" + String.format("%.2f", linusTorvalds.computePay(5.5)));
        System.out.println();


        System.out.println("FullTimeHourly Class");
        FullTimeHourly johnKimball = new FullTimeHourly("John", "Kimball", new Address(284, "Dry Pond Rd Covington", "Georgia", "82342", "GA"), 114, 35.0, 550.75);
        johnKimball.setDirectDeposit(true);
        johnKimball.introduce(true);
        System.out.println("Paycheck: $" + String.format("%.2f", johnKimball.computePay(29)));
        System.out.println();

        FullTimeHourly tungNguyen = new FullTimeHourly("Tung", "Nguyen", new Address(131, "Ba Ria Cho Lon", "Vung Tau", "70012", "TA"), 115, 18.0, 0.0);
        tungNguyen.setEducation("High School");
        tungNguyen.introduce(false);
        System.out.println("Paycheck: $" + String.format("%.2f", tungNguyen.computePay(40)));
        System.out.println();


        System.out.println("PartTimeHourly Class");
        PartTimeHourly vanTeoNguyen = new PartTimeHourly("VanTeo", "Nguyen", new Address(151, "Tao Lao Bi Dao", "Hai Phong", "56145", "BA"), 13.5);
        vanTeoNguyen.setSSN("789-10-3456");
        vanTeoNguyen.setAge(19);
        vanTeoNguyen.introduce(true);
        System.out.println("Paycheck: $" + String.format("%.2f", vanTeoNguyen.computePay(40)));
        System.out.println();

        PartTimeHourly elizabethHolmes = new PartTimeHourly("Elizabeth", "Holmes", new Address(1340, "4446 88th Ave SE Mercer Island", "Washington", "98040", "WA"), 15.5);
        elizabethHolmes.introduce(false);
        System.out.println("Paycheck: $" + String.format("%.2f", elizabethHolmes.computePay(35)));
        System.out.println();


        System.out.println("PartTime Contractor Class");
        Contractor luciusFox = new Contractor("Lucius", "Fox", new Address(1794, "The Alameda", "San Jose", "95125", "CA"), 40, 120);
        luciusFox.introduce(true);
        System.out.println("Paycheck: $" + String.format("%.2f", luciusFox.computePay(45)));
        System.out.println();

        Contractor heathLedger = new Contractor("Heath", "Ledger", new Address(1170, "Shakespeare Avenue", "Bronx", "71732", "NY"), 100, 121);
        heathLedger.introduce(false);
        System.out.println("Paycheck: $" + String.format("%.2f", heathLedger.computePay(50)));
        System.out.println();


        System.out.println("Customer Class");
        Customer bruceWanye = new Customer("Bruce", "Wanye", 33, "713-31-1931", new Address(1007, "Mountain Drive", "Gotham", "90000", "GT"), 118, "Cash");
        bruceWanye.introduce();
        bruceWanye.makePayment();
        System.out.println();

        Customer alfredPennyworth = new Customer("Alfred", "Pennyworth", 65, "172-39-1999", new Address(20, "Keller StValley Stream", "New York", "81818", "NY"), 119, "Credit Card");
        alfredPennyworth.introduce();
        alfredPennyworth.makePayment();
        System.out.println();
    }
}
