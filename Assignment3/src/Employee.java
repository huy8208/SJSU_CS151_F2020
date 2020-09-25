//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public abstract class Employee extends Person {
    private int id;
    private String educationLevel;
    private boolean directDeposit;


    Employee() {
        super();
        this.id = -1;
        this.educationLevel = "default";
        this.directDeposit = false;
    }

    Employee(String firstName, String lastName, Address address, int id) {
        super(firstName, lastName, -1, "Unset ssn", address);
        this.id = id;
        this.educationLevel = "Unset Education Level";
        this.directDeposit = false;
    }

    public int getId() {
        return id;
    }

    public String getEducation() {
        return educationLevel;
    }

    public boolean getDirectDeposit() {
        return directDeposit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEducation(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }

    public String toString() {
        //Since Employee is an abstract class, it can not be instantiated
        //toString method will be used for extended class.
        return "Employee{" +
                "id=" + id +
                ", educationLevel='" + educationLevel + '\'' +
                ", directDeposit=" + directDeposit +
                '}';
    }

    public void introduce() {
        //Print out Person information.
        System.out.println(super.toString());
    }
}
