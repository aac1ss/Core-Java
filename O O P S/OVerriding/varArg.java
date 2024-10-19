class P{
int x=888;
	}

class C extends P{
int x=999;
}
class varArg{
	public static void main(String[] args){
	P p=new P();
	System.out.println(p.x);
	C c=new C();
	System.out.println(c.x);	
	P r=new C();
	System.out.println(r.x);
	}
}