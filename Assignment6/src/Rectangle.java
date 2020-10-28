public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        double area = width * length;
        System.out.println("Area of the rectangle is: " + area);
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
