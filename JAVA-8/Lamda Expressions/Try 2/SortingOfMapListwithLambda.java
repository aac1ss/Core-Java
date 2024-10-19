import java.util.*;

class SortingOfMapListwithLambda{
	public static void main(String[] args) {

// List	
		List<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(12);
		al.add(13);
		al.add(15);
		al.add(9);
		System.out.println("Before Sorting \n"+al);
		Collections.sort(al,(a,b) -> b - a);
		System.out.println("Before Sorting \n"+al);

// Map
	Map<String,Integer> m=new TreeMap<>();
		m.put("One",23);
		m.put("Two",21);
		m.put("Three",2);
		m.put("Four",3);
		System.out.println("Before Sorting Map with 'String' Key \n"+m);
	
	Map<String,Integer> mm=new TreeMap<>(Comparator.reverseOrder());
		mm.put("One",23);
		mm.put("Two",21);
		mm.put("Three",2);
		mm.put("Four",3);
		System.out.println("After Sorting Map with 'String' Key \n"+mm);	
	
	Map<Integer,String> mmm=new TreeMap<>((a,b)-> b-a);
		mmm.put(23,"One");
		mmm.put(21,"Two");
		mmm.put(2,"Three");
		mmm.put(3,"Four");
		System.out.println("After Sorting Map with 'Integer' Key \n"+mmm);	
	


	}
}