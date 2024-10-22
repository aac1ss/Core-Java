class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 16; i++) {
            System.out.println("Child Thread");
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();

        for (int i = 0; i < 16; i++) {
            System.out.println("Main Thread");
        }
    }
}