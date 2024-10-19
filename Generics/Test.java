class Gen<T>{		
	T ob;	
	
	Gen(T ob){
	this.ob=ob;
	}
	
	public void show(){
	System.out.println("The type of ob is: "+ob.getClass().getName());
	}

	public T getOb(){
	return ob;
	}

}
class Test{
	public static void main(String[] args){	
	Gen <String> g1=new Gen<String>("Ashsi");
	g1.show();
	System.out.println(g1.getOb());
	
	Gen <Integer> g2=new Gen<Integer>(1);
	g2.show();
	System.out.println(g2.getOb());
	
	Gen <Boolean> g3=new Gen<Boolean>(true);
	g3.show();
	System.out.println(g3.getOb());
	
	Gen <Float> g4=new Gen<Float>(69.6789979f);
	g4.show();
	System.out.println(g4.getOb());
	
	Gen <Double> g5=new Gen<Double>(69.69);
	g5.show();
	System.out.println(g5.getOb());
	}
}



