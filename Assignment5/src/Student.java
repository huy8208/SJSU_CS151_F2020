//SJSU CS-151
//Assignment 5
//Name: Duc Huy Nguyen

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

    //  Constructor
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

    //Sort courses based on selected attribute.
    public void sortCourses(boolean ascending, String courseAttribute){
        if (courseAttribute.equals("name")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course o1, Course o2) {
                        return o1.getName().compareToIgnoreCase(o2.getName());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
        if (courseAttribute.equals("description")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course o1, Course o2) {
                        return o1.getDescription().compareToIgnoreCase(o2.getDescription());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
        if (courseAttribute.equals("department")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course o1, Course o2) {
                        return o1.getDepartment().compareToIgnoreCase(o2.getDepartment());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
        if (courseAttribute.equals("timeStart")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course o1, Course o2) {
                        return o1.getTimeStart().compareToIgnoreCase(o2.getTimeStart());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
        if (courseAttribute.equals("weekday")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course o1, Course o2) {
                        return o1.getWeekday().compareToIgnoreCase(o2.getWeekday());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
    }
}
