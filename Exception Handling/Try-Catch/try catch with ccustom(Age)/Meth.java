import java.util.*;
public class Meth{
public void check(){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name=sc.nextLine();
	
	System.out.println("Enter Your Age");
	int age=sc.nextInt();
	
	Voter r=new Voter(name,age);
	try{
		int num=r.getAge();
		if(num<18){
			throw new AgeSmallException("You Are too Young to Vote! Grow Up.. :)");
		}	
		else if(num>60){
			throw new AgeOldException("You Are too Old to Vote! Rest up Oldie.. :)");
		}
		else{
			System.out.println("Oh you are Sweet "+num+". "+"You are Eligible to Vote !!! ");
		}
	}
	catch(AgeSmallException | AgeOldException e){
		System.out.println(e.toString());
	}
	finally{
		sc.close();
	}
}

}