import java.util.*;

public class Meths{
		
		private Scanner sc=new Scanner(System.in);
		private Bank account;

		public Meths(Bank account){
			this.account=account;
		}
		
		public void Choice(){
		System.out.println("------------------------------------");
		System.out.println(" ! ! Welcome to ABC BANK ! !");
		System.out.println("1. WITHDRAW	");
		System.out.println("2. DEPOSIT");
		System.out.println("3. Check Balance");
		
		System.out.println("Enter Your Option (1|2|3)");
		int choice=sc.nextInt();
		System.out.println("You chose Option: "+ choice	);
		
		switch(choice){
		case 1:
			withdraw();					
		break;
		
		case 2:
			deposit();					
		break;
		
		case 3:
			checkBalance();					
		break;
		
		default:
			System.out.println("Enter a Valid Choice");
		break;
		}
	}

		private void deposit(){
			System.out.println("Enter amount to Deposit");
			double amount=sc.nextDouble();
			try{	
			account.deposit(amount);
			}
			catch(InvalidException ie){
				System.err.println(ie.getMessage());
			}

	}		

		private void withdraw(){
			System.out.println("Enter amount to withdraw");
			double amount=sc.nextDouble();
			try{
			account.withdraw(amount);
			}
			catch(InsufficientFundsException ife){
				System.err.println(ife.getMessage());
			 } catch (InvalidException e) {
            System.err.println(e.getMessage());
        }

		}
		private void checkBalance(){
			System.out.println("Your Balance is: "+account.getBalance()	);
		}
			
	
}	