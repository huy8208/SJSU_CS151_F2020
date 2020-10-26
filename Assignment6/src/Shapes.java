import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private List<Shape> shapeList;

    Shapes() {
        shapeList = new ArrayList<Shape>();
    }

    // Getter
    public List<Shape> getShapeList() {
        return shapeList;
    }

    // Setter
    public void setShapeList(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public static void main(String[] args) {
        Shapes shapesObject = new Shapes();

        shapesObject.getShapeList().add(new Rectangle(5, 10));
        shapesObject.getShapeList().add(new Rectangle(2, 3));
//        shapesObject.getShapeList().add(new Triangle(3, 4));

        for (Object o : shapesObject.getShapeList()) {
            o.start();
        }


    }
}
