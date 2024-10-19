public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidException {
        if (amount <= 0) {
            throw new InvalidException("Enter a valid positive number.");
        }
        balance += amount;
        System.out.println("Amount " + amount + " added successfully!");
        System.out.println("New balance is: " + balance + "!");
    }

    public void withdraw(double amount)  throws InvalidException,InsufficientFundException{
    //    try {
            if (amount <= 0) {
                throw new InvalidException("Enter a valid positive number.");
            }
            if (balance < amount) {
                throw new InsufficientFundException("You do not have enough funds to withdraw this amount!");
            }
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully!");
            System.out.println("New balance is: " + balance + "!");
    //     } catch (InvalidException e) {
    //        System.err.println(e.getMessage());
    //    } catch (InsufficientFundException e) {
    //        System.err.println(e.getMessage());
    //     }
    }
}