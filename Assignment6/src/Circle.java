public class Circle extends Shape {
    final private double PI = 3.14;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        double area = PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
    }

    public void run() {
        try {
            System.out.println("Class " + this.getClass() + ", current thread: " + Thread.currentThread().getName());
            computeArea();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

}
