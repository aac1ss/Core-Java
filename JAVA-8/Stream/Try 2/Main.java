import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class Main{
	public static void main(String[] args) {
		Integer[] list={1,2,3,4,5,6,1};
		List<Integer> lst=Arrays.asList(list);

// Converting  "List" to "Stream"
		Stream<Integer> myArrStream=lst.stream()
									.filter(i->i%2==0)
									.map(m->m*2)
									.distinct();

// Converting "List" to "Stream" to "List"
		List<Integer> myArrStream2=lst.stream()
									.filter(i->i%2==0)
									.map(m->m*2)
									.collect(Collectors.toList());


		myArrStream.forEach(System.out::println);

		myArrStream2.forEach(System.out::println);

	}
}