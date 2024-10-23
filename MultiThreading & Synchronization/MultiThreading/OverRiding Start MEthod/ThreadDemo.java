class MyRunnable extends Thread {
    public void start() {
            System.out.println("Start method");
        }
    public void run() {
            System.out.println("Run method");
        }

    }

class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable t = new MyRunnable();
        t.start();	
        System.out.println("Main Thread");
        }
}