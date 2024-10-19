interface intrf {
 void meth1();	
}

interface B extends intrf  {
 void meth1();	
}

interface C extends  intrf {
 void meth1();	
}

class A implements B,C{
	public void meth1(){
	System.out.println("This is implementing the Interface");
	}
	public static void main(String[] args){
	A r=new A();
	r.meth1();
	}
	
}