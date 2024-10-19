import java.util.*;
class A{

	public static void main(String[] args){
		System.out.println("Enter first Number");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println("Enter Second Number");
		int r1=sc.nextInt();
		
		try{
			double ans= r/r1;
			System.out.println("The answer is "+ans);
		}
		catch(ArithmeticException | InputMismatchException ai){
			ai.printStackTrace();
		}
	}

}