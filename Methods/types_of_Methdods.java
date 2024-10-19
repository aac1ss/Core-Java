abstract class abstrc{
	abstract void abst();
	}

public class types_of_Methdods extends abstrc{

	@Override
	void abst(){
	System.out.println("This is an Abstract Method");
	}
	static void staticM(){
	System.out.println("This is a static Method");
	}
	void Instnc(){
	System.out.println("This is an Instance Method");
	}
	public static void main(String[] args){
	types_of_Methdods r= new types_of_Methdods();
	r.abst();		
	staticM();
	r.Instnc();
	}
}