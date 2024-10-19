import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Meths<String> meths = new Meths<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------x----------------------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Elements");
            System.out.println("4. Check Size");
            System.out.println("5. Exit");
            System.out.println("----------------------x----------------------");
            System.out.print("Enter Your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to Enqueue: ");
                    String element = scanner.nextLine();
                    meths.enq(element);
                    break;
                case 2:
                    meths.deq();
                    break;
                case 3:
                    meths.display();
                    break;
                case 4:
                    System.out.println("Current size of the queue: " + meths.size());
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}