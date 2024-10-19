abstract class A{
	abstract void show();
}
public class Abstr extends A{
	@Override 
	public void show(int a){
	System.out.println(a);
	//System.out.println("THIS IS Abstract Class");
	}
	public static void main(String[] args){
	Abstr r=new Abstr();
	r.show(20);
	}
}


