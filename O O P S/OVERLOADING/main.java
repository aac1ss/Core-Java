class sup{
	void meth(){
	System.out.println("This is first method");
	}
	int meth(int a){
	
	System.out.println("This is next method with value "+ a);
	return a;	
}

	
}
class main{
	public static void main(String[] args){
	sup r=new sup();
	r.meth();	
	r.meth(10);	
		
}
}