//SJSU CS-151
//Assignment 5
//Name: Duc Huy Nguyen

import java.util.*;

public class ListManipulator {
    static public ArrayList<Integer> sort(ArrayList<Integer> myLst,Boolean ascending){
        if (ascending){
            Collections.sort(myLst);
        }
        else{
            Collections.sort(myLst,Collections.reverseOrder());
        }
        return myLst;
    }

    static public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
        Collections.swap(myLst,myLst.indexOf(Collections.max(myLst)),myLst.indexOf(Collections.min(myLst)));
        return myLst;
    }

    // Create a TreeMap from an arrayList.
    // Key: arrayList values  |   Values: number of occurrences.
    // Reason for using TreeMap:
    //      1.They are already sorted.
    //      2.No duplicated keys.
    //      3.Easy to track number of occurrences with key-value structure.
    static void table(ArrayList<Integer> myLst){
        TreeMap<Integer,Integer> myTeeMap = new TreeMap<Integer, Integer>();

        //Traverse ArrayList and create TreeMap structure.
        for (int i = 0; i < myLst.size(); i++){
            if (myTeeMap.containsKey(myLst.get(i))){
                myTeeMap.put(myLst.get(i), myTeeMap.get(myLst.get(i)) +1);
            }
            else{
                myTeeMap.put(myLst.get(i),1);
            }
        }

        //Print out myTeeMap
        for (Map.Entry<Integer, Integer> e : myTeeMap.entrySet())
            System.out.println("Key: "+e.getKey()
                    + " "
                    + "| Occurrences: "+e.getValue());
    }
}
