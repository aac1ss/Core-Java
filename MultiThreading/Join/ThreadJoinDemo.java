class myThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
            
        try{
        Thread.sleep(2500);
        }
        catch(InterruptedException e){

        }
        }
    }
}

class ThreadJoinDemo{
    public static void main(String[] args) throws InterruptedException {
        myThread t=new myThread();
        t.start();
        t.join(10000);
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }
    }
}