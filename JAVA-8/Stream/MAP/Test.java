import java.util.Arrays;
import java.util.stream.Stream;

class Test {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};

        Stream<Integer> integerStream = Arrays.stream(numbers);
        Stream<Integer> filteredIntegerStream = integerStream.filter(num -> num > 5);
        Stream<String> mappedStream = filteredIntegerStream.map(number -> {
            switch (number) {
                case 6: return "Six";
                case 7: return "Seven";
                default: return "Number in word not available";
            }
        });

        mappedStream.forEach(num -> System.out.println(num));
    }
}