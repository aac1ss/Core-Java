class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.setPriority(7);
        myRunnable.start();
       System.out.println(myRunnable.getPriority());
        
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }
        }
}

class MyRunnable extends Thread {
   
   public void run()
    {
        for(int i=0;i<5;i++){
            System.out.println("child Thread");
        }
    }

   }