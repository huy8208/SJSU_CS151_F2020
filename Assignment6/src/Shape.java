abstract class Shape extends Thread {
    private String objName;

    Shape(String objName) {
        this.objName = objName;
    }

    public String getObjName() {
        return objName;
    }

    public void computeArea() {
        System.out.println("Shape class compute area is running, should be overridden");
    }

    public void run() {
        try {
            System.out.println("Class " + this.objName + ", current thread: " + Thread.currentThread().getId());
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
