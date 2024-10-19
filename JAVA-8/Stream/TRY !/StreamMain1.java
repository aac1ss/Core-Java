import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamMain1{
	public static void main(String[] args) {
		
		List<Integer> list1= new ArrayList<>();
		list1.add(19);
		list1.add(27);
		list1.add(32);
		list1.add(43);
		list1.add(54);
		list1.add(65);
		list1.add(70);

		List<Integer> list2= new ArrayList<>();
		for(Integer i:list1){
			if(i%2==0){
				list2.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(list2);

		Stream<Integer> stream1 = list1.stream();

		Stream<Integer> stream2 = list1.stream();

		List<Integer> newlist=stream1.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newlist);
		List<Integer> arkoList= stream2.filter(i->i>30).collect(Collectors.toList());
		System.out.println(arkoList);
	}
}