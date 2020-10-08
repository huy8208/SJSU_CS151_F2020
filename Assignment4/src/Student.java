// SJSU-CS151
// Assignment 4
// Duc Huy Nguyen

public class Student implements Cloneable{
    private String firstName,lastName,major,department;
    private int age;
    private double gpa;
    private Course course;

    Student(String firstName,String lastName,String major, String department,int age, double gpa, Course course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
        this.course = course;
    }

    public String getDepartment() {return department;}
    public int getAge() {return age;}
    public String getLastName() {return lastName;}
    public String getFirstName() {return firstName;}
    public Course getCourse() {return course;}
    public double getGpa() {return gpa;}
    public String getMajor() {return major;}
    public void setDepartment(String department) {this.department = department;}
    public void setAge(int age) {this.age = age;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", course=" + course +
                '}';
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }
}
