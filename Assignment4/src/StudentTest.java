// SJSU-CS151
// Assignment 4
// Duc Huy Nguyen

public class StudentTest {
    public static void main(String[] args) {
        Student johnSmith = new Student("John","Smith","Computer Science major","School of Computer Science department",20,3.6,
                new Course("CS151","Object Oriented Design and Programming","CS","6:00pm","Tue"));
        Student willSmith = null;
        try{
            willSmith = (Student) johnSmith.clone();
            johnSmith.printInfo();
            System.out.println();
            willSmith.printInfo();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
