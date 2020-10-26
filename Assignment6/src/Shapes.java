import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shapes {
    private List<Object> shapeList;

    Shapes() {
        shapeList = Collections.synchronizedList(new ArrayList<Object>());
    }

    // Getter
    public List<Object> getShapeList() {
        return shapeList;
    }

    // Setter
    public void setShapeList(List<Object> shapeList) {
        this.shapeList = shapeList;
    }

    public static void main(String[] args) {
        Shapes shapesObject = new Shapes();

        shapesObject.getShapeList().add(new Thread(new Rectangle("rectangle 1", 5, 10)));
        shapesObject.getShapeList().add(new Thread(new Rectangle("rectangle 2", 2, 3)));
        shapesObject.getShapeList().add(new Thread(new Triangle("rectangle 1", 3, 4)));

        for (Object o : shapesObject.getShapeList()) {

        }


    }
}
