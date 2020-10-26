public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(String objName, double width, double length) {
        super(objName);
        this.length = length;
        this.width = width;
    }

    @Override
    public void computeArea() {
        double area = width * length;
        System.out.println("Area of the rectangle is: " + area);
    }

}
