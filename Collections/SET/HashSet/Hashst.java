import java.util.HashSet;
import java.util.Iterator;

class Hashst {
	public static void main(String[] args){
	HashSet<Integer> set=new HashSet<>();
// Insert
	
	set.add(7);
	set.add(5);
	set.add(2);
	set.add(3);
	System.out.println(set);
// Search
	if(set.contains(2)){
	System.out.println("Contains 2");
	}else{
	System.out.println("Does not Contain");
	}
//Delete
	set.remove(5);
	System.out.println(set);

//Size
	set.size();
	System.out.println(set);

//Iterator (Used for Set because  set doesn;t have index ) 	
	Iterator it=set.iterator();
//hasNext,next
	while(it.hasNext()){
	System.out.println(it.next());
}
	


}}