class instance_Flow{
	int i=10;
	
	{
	m1();	
	System.out.println("First Instance Block");	
	}

	instance_Flow(){
	System.out.println("Constructor");
	}

	public static void main(String[] args){
	 instance_Flow t= new instance_Flow();	
	System.out.println("Main");
	}
	
	public void m1(){
	System.out.println(j);
	}
	
	{
	System.out.println("Second iNstance Block");
	}
	
	int j=20;
}