//SJSU CS-151
//Assignment 6
//Name: Duc Huy Nguyen


public class Rectangle extends Shape implements Comparable<Rectangle> {
    private double width;
    private double length;

    Rectangle(String objectName, double width, double length) {
        super(objectName);
        this.length = length;
        this.width = width;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //  Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double computeArea() {
        return width * length;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "} " + super.toString();
    }
    
    public int compareTo(Rectangle that) {
        return (int) (this.getLength() - that.getLength());
    }
}
