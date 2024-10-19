class sup{
	void meth(){
	System.out.println("This is from super class");
	}
}
class sub extends sup{
	@Override
	void meth(){
	System.out.println("This is from sub class");
	}
	
}
class main{
	public static void main(String[] args){
	sup r=new sub();
	sup r1=new sup();
	r.meth();	
	r1.meth();	
	
	}
}