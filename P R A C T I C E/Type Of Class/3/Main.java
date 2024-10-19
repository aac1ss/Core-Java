	class A<T>{
	    
	    private LinkedList<T> list = new LinkedList<>();
		
	
	public T getroll(){
		return roll;
	}

	public T getName(){
		return name;
	} 	
	public void disp(){
	System.out.println("Roll no: "+ roll +"Name: "+name);
	System.out.println("Type of Object is :"+ name.getClass().getName());
	}

}

class Main{
public static void main(String[] args){
	A<String> r= new A<>("1","asas");
	r.disp();
}
}
	