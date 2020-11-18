//SJSU CS-151
//Assignment 6
//Name: Duc Huy Nguyen


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shapes implements Comparator<Shape> {
    private ArrayList<Shape> shapeList;

    Shapes() {
        shapeList = new ArrayList<Shape>();
    }

    // Getter
    public List<Shape> getShapeList() {
        return shapeList;
    }

    // Setter
    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    synchronized public void compute() {
        for (Shape shape : shapeList) {
            shape.start();
        }
    }

    public void add(Shape object) {
        shapeList.add(object);
    }

    public void remove(Shape object) {
        shapeList.remove(object);
    }

    public Shape min(){
        return Collections.min(shapeList,new Shapes());
    }

    public Shape max(){
        return Collections.max(shapeList,new Shapes());
    }


    // Do not use comparator for shape , use for each subclasses in shape
    public int compare(Shape o1, Shape o2) {
        return (int) (o1.computeArea() - o2.computeArea());
    }
}
