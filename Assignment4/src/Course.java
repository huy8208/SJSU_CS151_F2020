// SJSU-CS151
// Assignment 4
// Duc Huy Nguyen

public class Course implements Cloneable{
    private String courseName, courseDescription, department, courseStartingTime, weekday;

    Course(String courseName,String courseDescription, String department, String courseStartingTime, String weekday){
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.courseStartingTime = courseStartingTime;
        this.weekday = weekday;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCourseName() {return courseName;}

    public String getCourseDescription() {return courseDescription;}

    public String getDepartment() {return department;}

    public String getCourseStartingTime() {return courseStartingTime;}

    public String getWeekday() {return weekday;}

    public void setCourseName(String courseName) {this.courseName = courseName;}

    public void setDepartment(String department) {this.department = department;}

    public void setCourseDescription(String courseDescription) {this.courseDescription = courseDescription;}

    public void setCourseStartingTime(String courseStartingTime) {this.courseStartingTime = courseStartingTime;}

    public void setWeekday(String weekday) {this.weekday = weekday;}

    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", department='" + department + '\'' +
                ", courseStartingTime='" + courseStartingTime + '\'' +
                ", weekday='" + weekday + '\'' +
                '}';
    }
}
