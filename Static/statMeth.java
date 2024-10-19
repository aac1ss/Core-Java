class A{
	static void methT(){
		System.out.println("This is a static method");
		}
}
class statMeth{	
	void methO(){
		System.out.println("This is non static  method");
		}	

public static void main(String[] args)
	{
	statMeth r=new statMeth();
	r.methO();
	A.methT();	
	}
}