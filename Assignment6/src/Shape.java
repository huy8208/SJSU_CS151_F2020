//SJSU CS-151
//Assignment 6
//Name: Duc Huy Nguyen


import java.io.Serializable;

public class Shape extends Thread implements Serializable {
    private String objectName;

    Shape(String objectName) {
        this.objectName = objectName;
    }

    public Shape() {
        this.objectName = null;
    }

    //  Getter
    public String getObjectName() {
        return objectName;
    }

    // Setter
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public double computeArea() {
        return 0;
    }

    public void run() {
        try {
            System.out.println(this.getClass() + ", " + objectName + ", current thread: " + Thread.currentThread().getName()
                    + " .Area is: " + computeArea());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    public String toString() {
        return "Shape{" +
                "objectName='" + objectName + '\'' +
                '}';
    }
}
