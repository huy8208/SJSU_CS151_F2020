public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public float getGpa(){
        return gpa;
    }

    public String getMajor(){
        return major;
    }

    public String getDepartment(){
        return department;
    }

    Student (String firstName,String lastName, int age, float gpa, String major, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }


    class Course {
        public void printSchedule() {
            System.out.println(major+" Tue/Thur 6-7:15 ");
        }
    }

}


