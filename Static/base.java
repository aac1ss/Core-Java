class Base{
	static int i=10;
	
	static{
	m1();
	System.out.println("BAse Block");
	}
	
	public static void main(String[] args){
	m1();
	System.out.println("BAse Main");
	}
	
	public static void m1(){
	System.out.println(j);
	}

	static int j=20;

}
class Derived extends Base{
	static int x=100;
	
	static{
	m2();
	System.out.println("derived Static Block");
	}
	
	public static void main(String[] args){
	m2();
	System.out.println("Derivedd Main");
	}
	
	public static void m2(){
	System.out.println(y);
	}

	static{
	System.out.println("Derived form Statc block ");
	}

	static int y=200;

	
	}
