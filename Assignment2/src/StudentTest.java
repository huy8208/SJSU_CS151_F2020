//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//StudentTest.java
//This class aims to Student class.

public class StudentTest {
    public static void main(String[] args) {
        Student johnSmith = new Student("John","Smith",20,3.6f,"Computer Science","School of Computer Science");

        Student.Course johnSmithCourse = johnSmith.new Course();

        johnSmithCourse.printSchedule();

    }
}
