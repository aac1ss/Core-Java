class Complex {
	public void m1(int i){
	System.out.println("It's int arg");
	}
	public void m1(float r){
	System.out.println("It's floatt arg");
	}
public static void main(String[] args)
{
	Complex r=new Complex();
	
	r.m1(1);
	r.m1(2.3f);
	r.m1(10l);
	r.m1('a');
	}
}
