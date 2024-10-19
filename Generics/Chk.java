class Chk<C>{
	C obj;
	
	Chk(C obj){
	this.obj=obj;
	}

	public void show(){
	System.out.println("the type of Obj is"+obj.getClass().getName());
	}
	
	public C getVal(){
	return obj;
	}
	public static void main(String[] args){
	Chk<String> l=new Chk<>("hekasf");
	l.show();
	System.out.println("The Value is: "+l.getVal());
	}
	
}