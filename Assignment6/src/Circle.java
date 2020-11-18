//SJSU CS-151
//Assignment 6
//Name: Duc Huy Nguyen


public class Circle extends Shape implements Comparable<Circle> {
    final private double PI = 3.14;
    private double radius;

    Circle(String objectName, double radius) {
        super(objectName);
        this.radius = radius;
    }

    //  Getters
    public double getRadius() {
        return radius;
    }

    //  Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return PI * radius * radius;
    }

    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                "} " + super.toString();
    }

    public int compareTo(Circle that) {
        return (int) (this.getRadius() - that.getRadius());
    }
}
