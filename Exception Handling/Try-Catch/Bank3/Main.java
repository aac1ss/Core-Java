import java.util.*;
class Main{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter You accouunt Name");
		String nam=sc.nextLine();

		System.out.println("Enter Your initial Balance");
		double bal=sc.nextDouble();
	
		Bank myAccount=new Bank(nam,bal);

		Meths obj=new Meths(myAccount);
	while(true){
	obj.Choice();
	System.out.println("Do you want to perform more Actions(Y/N)?");
	String contChoice=sc.next();
	if(!contChoice.equalsIgnoreCase("y")){
		break;
	}
	}
		sc.close();
	}
}