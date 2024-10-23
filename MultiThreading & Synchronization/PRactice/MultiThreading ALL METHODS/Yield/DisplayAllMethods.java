/*
	1. Yield()
*/
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" is Running ");
		Thread.yield();
		}
	}
}
class DisplayAllMethods{
	public static void main(String[] args) throws InterruptedException{
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	t1.start();
	t2.start();
	System.out.println("Main Thread");
	}

}

