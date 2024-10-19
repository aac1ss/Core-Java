class A{

static {
System.out.println(r);		
}

static void r(){
System.out.println(r);		
}

static int r=1;
	
public static void main(String[] args){
	A.r();
}
}