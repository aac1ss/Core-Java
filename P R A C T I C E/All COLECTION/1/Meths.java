import java.util.*;
class Meths{
// Array List
	public ArrayList<A> Lisst(){
		ArrayList<A> al=new ArrayList<A>();
		al.add(new A(2,"Asus"));
		al.add(new A(1,"Zeus"));
		al.add(new A(4,"kesus"));
		al.add(new A(5,"Lexsus")); 	
		
		for(A stl: al){
		System.out.println(stl);
		}

		return al;	
	}
// Linked List
	public LinkedList<A> LLisst(){
		LinkedList<A> al=new LinkedList<A>();
		al.add(new A(2,"Asus"));
		al.add(new A(1,"Zeus"));
		al.add(new A(4,"kesus"));
		al.add(new A(5,"Lexsus"));
		for(A lslt:al){
		System.out.println(lslt);	
		}
		System.out.println("The object at 2th index is" +al.get(2));
		return al;
	}
// Sorted Set	
	public SortedSet<A> Ssett(){
		SortedSet<A> al=new TreeSet<A>();
		al.add(new A(2,"Asus"));
		al.add(new A(1,"Zeus"));
		al.add(new A(4,"kesus"));
		al.add(new A(5,"Lexsus"));
		for(A sset:al){
		System.out.println(sset);
		}
		return al;
	}
// Hash Set
	public HashSet<A> hashset(){
		HashSet<A> al=new HashSet<A>();
		al.add(new A(2,"Asus"));
		al.add(new A(1,"Zeus"));
		al.add(new A(4,"kesus"));
		al.add(new A(5,"Lexsus"));
		
		for(A hs:al){
			System.out.println(hs);
		}
		return al;
	}
// Hash Map
	public HashMap<String,A> hashmap(){
		HashMap<String,A> al=new HashMap<>();
		al.put("One",new A(2,"Asus"));
		al.put("TWO",new A(1,"Zeus"));
		al.put("THREE",new A(4,"kesus"));
		al.put("FOUR",new A(5,"Lexsus"));
		al.put("FOUR",new A(4,"Nissan"));
		al.put("THREE",new A(6,"Lexsus"));
		
		for(Map.Entry<String,A> entry : al.entrySet()){
		System.out.println(entry.getKey()+":"+entry.getValue());	
		}
		
		return al;
	}

}