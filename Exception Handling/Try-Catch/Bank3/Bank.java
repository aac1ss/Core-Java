public class Bank{
	
	private String accountName;
	private double balance;

	Bank(String no,double b){
		this.accountName=no;
		this.balance=b;
		}

	public String getName(){
		return accountName;
		}

	public double getBalance(){
		return balance;
		}

	public void withdraw(double amount) 
	throws  InvalidException,InsufficientFundsException
	{
//	try{	
			if(amount<=0){
				throw new InvalidException("Please Enter a Positive Number");
			}
			if(balance<amount){
				throw new InsufficientFundsException("You Do not have sufficient Funds for this action");
			}
		//}
				balance-=amount;
				System.out.println("You withdrew Rs."+" "+amount+"from your Bank Account");
				System.out.println("You have Rs. "+balance +" "+"in your account");
//		catch(InsufficientFundsException e){
//				System.err.println(e.getMessage());
		
		//}
	}

	public void deposit(double amount) throws InvalidException{
				if(amount<=0){
					throw new InvalidException("Please Enter a positive numeber! ");
					}	
				balance+=amount;
				System.out.println("You Deposited Rs."+amount+"to your Bank Account");
				System.out.println("You have Rs. "+balance +"in your account");
			}
		

	}



