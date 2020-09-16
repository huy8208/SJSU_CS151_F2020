public class Employee extends Person{
    private int id;
    private String status;
    private double basePay;

    Employee(String firstName,String lastName,int age,String ssn,String address,String gender,double weight,int id,String status,double basePay){
        super(firstName,lastName,age,ssn,address,gender,weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;
    }

    @Override
    public void introduce(){
        super.introduce();
        if (status == "contractor" || status == "part time") {
            System.out.println("ID:"+id+" |Status:"+status+" |Base Pay:$"+(int)basePay+"/hr");
        }
        else{
            System.out.println("ID:"+id+" |Status:"+status+" |Base Pay:$"+(int)basePay+"/yr");
        }

    }

    public double calculatePay(double unitWorked){
        //Calculate paycheck depending on employee status
        // (part time, contractor or full time) and compute accordingly.
        if (status == "full time"){
            return basePay * 1/52 * unitWorked;
        }
        else {
            return (int) basePay * unitWorked;
        }
    }
}
