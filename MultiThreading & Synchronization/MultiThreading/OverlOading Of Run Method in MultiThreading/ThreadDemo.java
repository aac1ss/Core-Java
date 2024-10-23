class MyRunnable implements Runnable {
    public void run() {
            System.out.println("No arg Run method");
        }
    public void run(int i) {
            System.out.println("Arg Run method");
        }

    }

class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();	
        }
}