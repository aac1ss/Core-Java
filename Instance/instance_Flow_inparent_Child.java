class instance_Flow_inparent_Child{
	int i=10;
	
	{
	m1();	
	System.out.println("Parent First Instance Block");	
	}

	instance_Flow_inparent_Child(){
	System.out.println("Parent Constructor");
	}

	public static void main(String[] args){
	instance_Flow_inparent_Child t= new instance_Flow_inparent_Child();	
	System.out.println("Parent Main");
	}
	
	public void m1(){
	System.out.println(j);
	}

	int j=20;
}
class Child extends instance_Flow_inparent_Child{
	int x=100;
	
	{
	m2();	
	System.out.println("Child First Instance Block");	
	}

	Child(){
	System.out.println("Child Constructor");
	}

	public static void main(String[] args){
	Child c= new Child();	
	System.out.println("Child Main");
	}
	
	public void m2(){
	System.out.println(y);
	}

	{
	
	System.out.println("Child Second Instance Block");	
	}

	int y=200;
}