//CS-151
//Professor Yulia Newton
//Assignment 2
//Name: Duc Huy Nguyen
//Product.java
//Final class. This class provides basic footprints to create immutable products.

final public class Product {
    private final String name;
    private final String description;
    private final double price;
    private final int maxQuantity;

    Product(String name, String description, double price, int maxQuantity){
        this.name = name;
        this.description = description;
        this.price = price;
        this.maxQuantity = maxQuantity;
    }
    public int getMaxQuantity() {
        return maxQuantity;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=$" + price +
                ", maxQuantity=" + maxQuantity +
                '}';
    }
}
