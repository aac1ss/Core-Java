
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount myAccount = new BankAccount(accountNumber, initialBalance);
        
        Meth obj = new Meth(myAccount);
        
        while (true) {
            obj.choice();
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String continueChoice = sc.next();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        sc.close();
    }
}