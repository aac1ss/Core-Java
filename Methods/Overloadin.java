public class Overloadin{
	void over(){
	System.out.println("This is 1st method with no parameters");
	}
	void over(int a){
	System.out.println("This is 2nd method with int a ie="+a);
	}
	void over(String a){
	System.out.println("This is 3rd method with a String a ie="+a);
	}
	void over(float a,double b){
	System.out.println("This is 4th method with parameters float a and double b i.e " + a +","+b+"respectively.");
	}

public static void main(String[] args){
	Overloadin r=new Overloadin();
	r.over();
	r.over(20);
	r.over("Ashish");
	r.over(23.34f,34.343);

}


}