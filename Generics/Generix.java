		class Generix<T>{
	
	T var;
	
	Generix(T var){
	this.var=var;
	}	
	
	public void disp(){
	System.out.println("The type of the obj is"+var.getClass().getName());
	}

	public T Show(){
	return var;	
	}
	
public static void main(String[] args){

	Generix<String> g1=new Generix<String>("Hi");
	g1.disp();
	System.out.println("The content in the Obj is = "+ g1.Show());

}
}