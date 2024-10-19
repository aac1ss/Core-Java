class Main{
	public static void main(String[] args) {
		khai obj=new khai();
		
		System.out.println("-----OverRidden from Class khai-------");
		obj.meth1();
		obj.meth2();

		System.out.println("--------------------------------------");
		System.out.println("--------From Interface lamda----------");
		
		i1 r=()->System.out.println("------Lambda 1------");
		i2 r1=()->System.out.println("------Lambda 2------");
		
		r.meth1();
		r1.meth2();
	}
}