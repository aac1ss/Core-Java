class P{
static int i=B.j;
	}
class B{
static int j=C.k;
	}
class C{
static int k=D.meth();
static String k1="AHAHHA";
	}
class D{
public static int meth(){
	return 69;
}
	}



class tightlyCoupled{
	public static void main(String[] args){
	System.out.println(P.i);
	System.out.println(B.j);
	System.out.println(C.k1);
	System.out.println(C.k);
	System.out.println(D.meth());
	}
}