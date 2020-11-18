//SJSU CS-151
//Assignment 6
//Name: Duc Huy Nguyen


public class Triangle extends Shape implements Comparable<Triangle> {
    private double base;
    private double height;

    public Triangle(String objectName, double base, double height) {
        super(objectName);
        this.base = base;
        this.height = height;
    }

    //  Getters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    //  Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double computeArea() {
        return (base * height) / 2;
    }

    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                "} " + super.toString();
    }

    public int compareTo(Triangle that) {
        return (int) (this.getBase() - that.getBase());
    }
}
