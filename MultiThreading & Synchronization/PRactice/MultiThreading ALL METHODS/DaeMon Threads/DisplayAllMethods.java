/*
	1. Yield()
*/
class MyThread extends Thread{
	public void run(){
		while(true){
		System.out.println(" Hello WORld ");
		}
	}
}
class DisplayAllMethods{
	public static void main(String[] args) throws InterruptedException{
	MyThread t=new MyThread();
	t.setDaemon(true);
	t.start();
	System.out.println("Main DOne");
	}

}

