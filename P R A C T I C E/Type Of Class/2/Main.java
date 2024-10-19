class A<T>{
	private T a;
	
	A(T a){
		this.a=a;
	}

	public T getT(){
		return a;
	}
@Override
	public String toString(){
		return "The object type is: "+a.getClass().getName();	
	}
}
class Main{
	public static void main(String[] args){
		A<Integer> al=new A<>(3);
		System.out.println(al);
		System.out.println("THe input was: "+ al.getT());
	}

}