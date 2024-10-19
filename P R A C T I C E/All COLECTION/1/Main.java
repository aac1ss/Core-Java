import java.util.*;
class Main{
	public static void main(String[] args){
	Meths obj=new Meths();
		
// Array List
		ArrayList<A> all= obj.Lisst();
		System.out.println("----------------------------");

// Linked List

		LinkedList<A> lls=obj.LLisst();
		
	System.out.println("----------------------------");
	System.out.println("----------------------------");

// Sorted Set

		SortedSet<A> ss=obj.Ssett();
		System.out.println("----------------------------");
		System.out.println("----------------------------");

// Hash Set
		
		HashSet<A> HssT= obj.hashset();	
		for(A hs:HssT){
			System.out.println(hs);
		}
		System.out.println("----------------------------");

// Hash Map

		HashMap<String,A> HasmP=obj.hashmap();
		for(Map.Entry<String,A> entry : HasmP.entrySet()){
		System.out.println(entry.getKey()+":"+entry.getValue());	
		}
		
		System.out.println("----------------------------");

	}
}
