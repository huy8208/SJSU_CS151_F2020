public class Shape extends Thread {

    
    public void computeArea() {
        System.out.println("To be overridden");
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
