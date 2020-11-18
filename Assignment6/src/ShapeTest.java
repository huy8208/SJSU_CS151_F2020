//SJSU CS-151
//Assignment 6
//Name: Duc Huy Nguyen

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShapeTest {
    public static void main(String[] args) throws IOException {
        Shapes shapesObject = new Shapes();

        shapesObject.add(new Triangle("Instance 1", 1, 2));
        shapesObject.add(new Triangle("Instance 2", 3, 4));
        shapesObject.add(new Circle("Instance 1", 5));
        shapesObject.add(new Circle("Instance 2", 6));
        shapesObject.add(new Rectangle("Instance 1", 7, 8));
        shapesObject.add(new Rectangle("Instance 2", 9, 10));
        shapesObject.add(new Hexagon("Instance 1", 11));
        Hexagon h1 = new Hexagon("Instance 2", 12);
        shapesObject.add(h1);
//        System.out.println("Removing hexagon instance 2");
//        shapesObject.remove(h1); // Tested. remove method is working.
        shapesObject.compute();

        System.out.println();
        System.out.println("Object with smallest area: " + shapesObject.min());
        System.out.println();
        System.out.println("Object with biggest area: " + shapesObject.max());


        // Output the state of 8 shapes to files named “obj1.ser”, “obj2.ser”, “obj3.ser”, etc..
        FileOutputStream streamOut = null;
        ObjectOutputStream objectOutput = null;
        try {
            for (int i = 0; i < shapesObject.getShapeList().size(); i++) {
                int temp = i + 1;
                streamOut = new FileOutputStream("obj" + temp + ".ser");
                objectOutput = new ObjectOutputStream(streamOut);
                objectOutput.writeObject(shapesObject.getShapeList().get(i));
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (objectOutput != null) {
                objectOutput.close();
            }
            if (streamOut != null) {
                streamOut.close();
            }
        }

    }
}
