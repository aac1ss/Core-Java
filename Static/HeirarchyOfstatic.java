class HeirarchyOfstatic{
	static int i=10;

	static{
	m1();
	System.out.println("First Static block");
	}

	public static void main(String[] args){
	m1();
	System.out.println("Main method");
	}
		
	public static void m1(){
	System.out.println(k);
	}
	static{
	System.out.println("Second Static block");
	}
	static int k=69;
	

}