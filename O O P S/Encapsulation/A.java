import java.util.Scanner;
class A{
	private int num;	
	
	public int getNum(){
	return num;
	}
	
	public void setNum(Scanner sc){
	System.out.println("Enter a number you want to print : ");
	int r=sc.nextInt();
	this.num=r;
	}

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	A r=new A();
	r.setNum(sc);
	System.out.println("The value that's passed is: "+r.getNum());
	sc.close();
}
}