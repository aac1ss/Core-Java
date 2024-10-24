
class SharedResource{

	private int data;
	private boolean hasData;

	public void produce(int value){
		while(hasData){
			try{
				wait();
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}

	public void consume(int value){
	
	}

}

class Producer implements Runnable{
	private SharedResource resource;
	public Producer(SharedResource resource){
		this.resource=resource;
	}
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			resource.produce(i);	
		}
	}
}
class Consumer implements Runnable{
	private SharedResource resource;
	public Consumer(SharedResource resource){
		this.resource=resource;
	}
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			int value=resource.consume();
			System.out.println("Consumed"+value);	
		}
	}
}


class ThreadCommunication{
	public static void main(String[] args) {
		SharedResource resource=new SharedResource();
		Thread producerThread =new Thread(new Producer(resource));
		Thread consumerThread =new Thread(new Consumer(resource));
		producerThread.start();
		consumerThread.start();

	}
}