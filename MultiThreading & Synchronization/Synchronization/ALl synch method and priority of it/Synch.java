
class Synch{

// WOrking flow of Synchronized Methods

	/* Static Synchronized hune bitikai they work on class level key nnot object
	 level key. So m1 pahila lincha euta thread ani that runs untill that
	 completes arko static synchronized thread chaldaina .
	  */

	/*With that running synchronized v4 feri object key liyera run gardai cha
	and m5 ta normal methdo ho it can easily acess and run
N
	*/
	static synchronized void m1(){
		System.out.println("Static synchronized Method 1");
	}

	static synchronized void m2(){
		System.out.println("Static synchronized Method 2 ");
	}

	static void m3(){
		System.out.println("Static Method 3");
	}

	synchronized void m4(){
		System.out.println("Synchronized Method 4");
	}

	void m5(){
		System.out.println("Normal Method 5");
	}

	public static void main(String[] args) {
		Synch obj=new Synch();
		Synch.m1();
		Synch.m2();
		Synch.m3();	
		obj.m4();
		obj.m5();

	}
}