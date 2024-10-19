class P{
	public void property(){
	System.out.println("PRoperty");
	
	}
	public void marry(){
	System.out.println("Marry");
	}
	public void marry(String a){
	System.out.println("marry Overriden");
	
	}
}
class Test{
public static void main(String[] args){
	P p=new P();
	p.marry();
	p.marry("HEllo");
	C c=new C();
	c.marry();
	c.marry("Hi");	
	P p1=new C();
	p1.marry();
	p1.marry("Hey");

}
}