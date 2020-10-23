//SJSU CS-151
//Assignment 5
//Name: Duc Huy Nguyen

import java.util.Collections;
import java.util.Comparator;

public class Course {
    private String name,description,department,timeStart,weekday;
    Course(String name, String description,String department,String timeStart,String weekday){
        this.name = name;
        this.description = description;
        this.department = department;
        this.timeStart = timeStart;
        this.weekday = weekday;
    }

    //  Getters
    public String getDepartment() { return department; }
    public String getWeekday() { return weekday; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getTimeStart() { return timeStart; }

    //  Setters
    public void setWeekday(String weekday) { this.weekday = weekday; }
    public void setDepartment(String department) { this.department = department; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setTimeStart(String timeStart) { this.timeStart = timeStart; }

    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", department='" + department + '\'' +
                ", timeStart='" + timeStart + '\'' +
                ", weekday='" + weekday + '\'' +
                '}';
    }

}
