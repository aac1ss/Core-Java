public class A<T>{
	T num;
	A(T num){
	this.num=num;
	}
	T show(){
	return num;
	}
	public void disp(){
	System.out.println("The obj type is "+num.getClass().getName());
	}
}