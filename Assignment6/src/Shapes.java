import java.util.ArrayList;
import java.util.List;

public class Shapes {
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
        for (int i = 0; i < shapeList.size(); i++) {
            shapeList.get(i).start();
        }
    }

}
