// Meth.java
import java.util.Scanner;

public class Meth {
    private Scanner sc = new Scanner(System.in);
    private BankAccount account;

    public Meth(BankAccount account) {
        this.account = account;
    }

    public void choice() {
        System.out.println("Welcome to The Bank!");
        System.out.println("What do you want to do?");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        int option = sc.nextInt();
        System.out.println("You chose option " + option);

        switch (option) {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                checkBalance();
                break;
            default:
                System.out.println("Invalid option! Please try again.");
                break;
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        try {
            account.deposit(amount);
        } catch (InvalidException e) {
            System.err.println(e.getMessage());
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: "); 
        double amount = sc.nextDouble();
        try {
            account.withdraw(amount);
        } catch (InsufficientFundException e) {
            System.err.println(e.getMessage());
        } catch (InvalidException e) {
            System.err.println(e.getMessage());
        }
    }

    private void checkBalance() {
        System.out.println("Your balance is: " + account.getBalance());
    }
}