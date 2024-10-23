class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName());
			try{
			Thread.sleep(100);
			}
			catch( InterruptedException e){
				System.out.println(e);
			}
			//System.out.println("Child Thread");
		}
	}
}
class DisplayAllMethods{
	public static void main(String[] args) throws InterruptedException{
	MyThread t=new MyThread("KhaikThread");
	t.start();
	t.join();	
	System.out.println("Main Thread");
	}

}

