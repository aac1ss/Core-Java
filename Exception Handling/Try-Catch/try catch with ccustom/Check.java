import java.util.*;
public class Check{
	public static void main(String[] args) throws NotNumberException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number to Enter: ");	
	
	try{
	int num=sc.nextInt();
	System.out.println("OH! "+ num+" "+"is a Number");
	}
	catch(InputMismatchException e){
	throw new NotNumberException("Not a Number");
}	
	finally{
		sc.close();
	}	
}
}
class NotNumberException extends Exception{
	public NotNumberException(String a){
		super(a);
	}

}