//SJSU CS-151
//Assignment 6
//Name: Duc Huy Nguyen


public class Hexagon extends Shape implements Comparable<Hexagon> {
    private double side;

    Hexagon(String objectName, double side) {
        super(objectName);
        this.side = side;
    }

    //  Getter
    public double getSide() {
        return side;
    }

    // Setter
    public void setSide(double side) {
        this.side = side;
    }

    public double computeArea() {
        return Math.sqrt(3) * side * side * 3 / 2;
    }

    public String toString() {
        return "Hexagon{" +
                "side=" + side +
                "} " + super.toString();
    }

    public int compareTo(Hexagon that) {
        return (int) (this.getSide() - that.getSide());
    }
}
