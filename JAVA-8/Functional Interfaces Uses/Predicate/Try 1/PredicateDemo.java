import java.util.function.Predicate;
class PredicateDemo{
	public static void main(String[] args) {
		// Req: age >21

		Predicate<Integer> ageCheck= age-> age>21;
		System.out.println(ageCheck.test(12)); // false
		System.out.println(ageCheck.test(22)); // True

		if(ageCheck.test(40)){
			System.out.println("eligible");
		}
		
	}
}