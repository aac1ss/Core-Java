import java.util.Scanner;
class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
	
	try{

		if(age<18){
		throw new RuntimeException("You Are Not eligible for Voting");
		}
	}
		
		else if(age>60){
				throw new RuntimeException"You are Oldie, Rest Up");
		}
		else{
			"Congratulatiton! You Are Eligible for Voting");
		}
		
	}
}