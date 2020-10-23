import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> listOfPersons = new ArrayList<Person>();
        listOfPersons.add(new Person("Joe","Smith",40));
        listOfPersons.add(new Person("Amy","Gold",32));
        listOfPersons.add(new Person("Tony","Stork",21));
        listOfPersons.add(new Person("Sean","Irish",24));
        listOfPersons.add(new Person("Tina","Brock",28));
        listOfPersons.add(new Person("Lenny","Hep",18));

//        Collections.sort(listOfPersons,Collections.reverseOrder());

        for(int i = 0; i < listOfPersons.size(); i++){
            System.out.println(listOfPersons.get(i));
        }

    }
}
