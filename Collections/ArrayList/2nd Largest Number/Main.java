import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(15);
    System.out.println("The Total Numbers Are:" +numbers);

        Collections.sort(numbers, Collections.reverseOrder());
    System.out.println("The Second Largest Number is: " +numbers.get(1));
    }
}