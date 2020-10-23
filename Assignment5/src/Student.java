import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Student {
    private String firstName,lastName,major,department;
    private int age;
    private double gpa;
    private LinkedList<Course> courses;

    //  Getters
    public String getDepartment() { return department; }
    public double getGpa() { return gpa; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public LinkedList<Course> getCourses() { return courses; }
    public String getMajor() { return major; }

    //  Setters
    public void setDepartment(String department) { this.department = department; }
    public void setAge(int age) { this.age = age; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMajor(String major) { this.major = major; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setCourses(LinkedList<Course> courses) { this.courses = courses;}

    Student(String firstName, String lastName, String major, String department, int age, double gpa, LinkedList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
        this.courses = courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }


    //Sort courses based on department.
    public void sortCourses(boolean ascending){
        if (ascending){
            Collections.sort(courses, new Comparator<Course>() {
                public int compare(Course o1, Course o2) {
                    return o1.getDepartment().compareToIgnoreCase(o2.getDepartment());
                }
            });
        }
        else{
            Collections.sort(courses, new Comparator<Course>() {
                public int compare(Course o1, Course o2) {
                    return o2.getDepartment().compareToIgnoreCase(o1.getDepartment());
                }
            });
        }
//         Testing
        for (Course e:courses){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
            Student stu1 = new Student("Duc","Huy","CS","Software Engineering",18,3.9,new LinkedList<Course>());
            stu1.addCourse(new Course("DATA STRUCTURE","Description","A","7:00","Mon-Fri"));
            stu1.addCourse(new Course("BUSINESS","Description","b","7:00","Mon-Fri"));
            stu1.sortCourses(false);
    }

}
