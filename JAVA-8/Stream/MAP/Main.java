import java.util.stream.*;
class Main{
	public static void main(String[] args) {
		Stream.of("Hello","hi", "ola", "bonjour")
			.forEach(System.out::println);
	}
}