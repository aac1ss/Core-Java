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
class test{
public static void main(String[] args){
	P p=new P();
	p.marry();
	p.marry("HEllo");
	P c=new P();
	c.marry();
	c.marry("Hi");	
	P p1=new P();
	p1.marry();
	p1.marry("Hey");

}
}