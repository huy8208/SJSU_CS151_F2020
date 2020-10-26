public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String objName, double base, double height) {
        super(objName);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public void computeArea() {
        double area = 1 / 2 * base * height;
        System.out.println("Area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle("t1", 5, 6);
        t1.start();
    }
}
