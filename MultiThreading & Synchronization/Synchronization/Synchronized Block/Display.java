class MyThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
	MyThread t=new MyThread();
	t.start();
	System.out.println("Main Thread");
	}

}

