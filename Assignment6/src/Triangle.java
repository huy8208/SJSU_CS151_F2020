public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void computeArea() {
        double area = 1 / 2 * base * height;
        System.out.println("Area of the triangle is: " + area);
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
