//Types of Access Modifiers

class ExesMod{
	private int r=1;	
	public void pub(){
	System.out.println("This is public method Accessed within the 	packages and classes.");
	}
	
	protected void prot(){
	System.out.println("This is protected method Accessed within the packages and classes	 	through sub-class.");
	}
	protected int getR(){
	return r;
}
	}
class Types extends ExesMod{
	public void defa(){
	System.out.println("This is public method Accessed within the 	package and class.");
	} 
	public void priv(){
	System.out.println("The value of Private r is:=." + getR());
	}
	public static void main(String[] args){
	Types re= new Types();
	re.pub();
	re.priv(); 
	re.defa();
	re.prot();		
	}
}