import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw: " + amount);

        // Try to acquire the lock
        if (lock.tryLock()) {
            try {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal: " + amount);
                    Thread.sleep(3000); // Simulate time taken for withdrawal
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completed withdrawal: " + amount);
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted during withdrawal");
            } finally {
                lock.unlock(); // Ensure the lock is released
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock");
        }
    }
}