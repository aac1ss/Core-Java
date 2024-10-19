@FunctionalInterface
interface i1{

	public abstract void meth1();

}

class c1{
	@Override
	public void meth1(){
		System.out.println("From the Implementing class (c1)");
	}
}
class Main{
	public static void main(String[] args) {
		C1 obj=new c1();
	}
}