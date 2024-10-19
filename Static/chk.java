class A{

	static {
	meth();
	}

	
	
	{
	System.out.println("This is an Instatance Block");	
	meth2();
	}

	void meth2(){
	System.out.println(b);
	}


	int b=20;

	static int a=10;
	
	static void meth(){
	System.out.println("This is a static method");
	System.out.println(a);
	}

	public static void main(String[] args){	
	System.out.println(a);
	A r=new A();
	}

}