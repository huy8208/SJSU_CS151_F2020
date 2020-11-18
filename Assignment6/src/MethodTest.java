//SJSU CS-151
//Assignment 6
//Name: Duc Huy Nguyen

import java.util.ArrayList;

public class MethodTest {
    public static <T> int count(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static void main(String[] args) {
        ArrayList<String> arrayListOfString = new ArrayList<>(5);
        arrayListOfString.add("Apple");
        arrayListOfString.add("Banana");
        arrayListOfString.add("Coconut");
        arrayListOfString.add("Strawberry");
        arrayListOfString.add("Carrot");
        System.out.println(count(arrayListOfString));

        ArrayList<Integer> arrayListOfInteger = new ArrayList<>(6);
        arrayListOfInteger.add(1);
        arrayListOfInteger.add(2);
        arrayListOfInteger.add(3);
        arrayListOfInteger.add(4);
        arrayListOfInteger.add(5);
        arrayListOfInteger.add(6);
        System.out.println(count(arrayListOfInteger));

        ArrayList<Double> arrayListOfDouble = new ArrayList<>(8);
        arrayListOfDouble.add(1.1);
        arrayListOfDouble.add(2.2);
        arrayListOfDouble.add(3.3);
        arrayListOfDouble.add(4.4);
        arrayListOfDouble.add(5.5);
        arrayListOfDouble.add(6.6);
        arrayListOfDouble.add(7.7);
        arrayListOfDouble.add(8.8);
        System.out.println(count(arrayListOfDouble));
    }
}
