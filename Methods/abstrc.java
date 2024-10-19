abstract class abst{
	abstract void meth();
} 
class abstrc extends abst{

	@Override		
	void meth(){
	System.out.println("This is an xoverriden Abstract Method");
		}
	
public static void main(String[] args){
	abstrc r=new abstrc();
	r.meth();
	}
}