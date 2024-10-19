class P{
	public void property(){
	System.out.println("PRoperty");
	
	}
	public void marry(){
	System.out.println("Marry");
	}	
}
class C extends P{
	public void marry(){
	System.out.println("marry Overriden");
	
	}
}
class Test{
public static void main(String[] args){
	P p=new P();
	p.marry();
	
	C c=new C();
	c.marry();
	
	P p1=new C();
	p1.marry();
}
}