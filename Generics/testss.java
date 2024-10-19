class tst<t>{
	t obj;
	
	tst(t obj){
	this.obj=obj;
	}

	public void show(){
	System.out.println("The type of Obj is"+obj.getClass().getName());
	}

	public t getOb(){
	return obj;
	}	
}
class testss{
	public static void main(String[] args){

	tst<String> t1=new tst<String>("hello");
	t1.show();
	System.out.println(t1.getOb());

	tst<Integer> t2=new tst<Integer>(1);
	t2.show();
	System.out.println(t2.getOb());


	}
	
}