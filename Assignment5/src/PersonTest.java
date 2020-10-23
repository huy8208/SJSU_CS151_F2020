//SJSU CS-151
//Assignment 5
//Name: Duc Huy Nguyen

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> listOfPersons = new ArrayList<Person>();
        listOfPersons.add(new Person("Joe","Smith",40));
        listOfPersons.add(new Person("Amy","Gold",32));
        listOfPersons.add(new Person("Tony","Stork",21));
        listOfPersons.add(new Person("Sean","Irish",24));
        listOfPersons.add(new Person("Tina","Brock",28));
        listOfPersons.add(new Person("Lenny","Hep",18));


        Comparator<Person> sortedByAgeComparator = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        Collections.sort(listOfPersons,sortedByAgeComparator);  //Ascending
        System.out.println("Sorted by age Ascending");
        for(int i = 0; i < listOfPersons.size(); i++){
            System.out.println(listOfPersons.get(i));
        }
        System.out.println();
        Collections.sort(listOfPersons,sortedByAgeComparator.reversed());   //Descending
        System.out.println("Sorted by age Descending");
        for(int i = 0; i < listOfPersons.size(); i++){
            System.out.println(listOfPersons.get(i));
        }


        System.out.println();
        Comparator<Person> sortedByFirstNameComparator = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            }
        };
        System.out.println("Sorted by name Ascending");
        Collections.sort(listOfPersons,sortedByFirstNameComparator);    //Ascending
        for(int i = 0; i < listOfPersons.size(); i++){
            System.out.println(listOfPersons.get(i));
        }
        System.out.println();
        Collections.sort(listOfPersons,sortedByFirstNameComparator.reversed()); //Descending
        System.out.println("Sorted by name Descending");
        for(int i = 0; i < listOfPersons.size(); i++){
            System.out.println(listOfPersons.get(i));
        }


        System.out.println();
        Comparator<Person> sortedByLastNameLengthComparator = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getLastName().length() - o2.getLastName().length();
            }
        };
        System.out.println("Sorted by last name's length Ascending");
        Collections.sort(listOfPersons,sortedByLastNameLengthComparator);    //Ascending
        for(int i = 0; i < listOfPersons.size(); i++){
            System.out.println(listOfPersons.get(i));
        }
        System.out.println();
        System.out.println("Sorted by last name's length Descending");
        Collections.sort(listOfPersons,sortedByLastNameLengthComparator.reversed()); //Descending
        for(int i = 0; i < listOfPersons.size(); i++){
            System.out.println(listOfPersons.get(i));
        }
    }
}
