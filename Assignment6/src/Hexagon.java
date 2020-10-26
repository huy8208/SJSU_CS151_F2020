public class Hexagon implements Shape, Runnable {
    private double side;

    Hexagon(double side) {
        this.side = side;
    }

    public void computeArea() {
        double area = (3 / 2) * Math.sqrt(3) * side * side;
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
