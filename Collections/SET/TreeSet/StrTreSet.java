import java.util.*;
class StrTreSet{
	public static void main(String[] args){
	TreeSet<String> t=new TreeSet<>(new myComparator());
	t.add("Reyna");
	t.add("Breach");
	t.add("Raze");
	t.add("Jett");
	t.add("Sova");
	t.add("Chamber");
	t.add("Cypher");
	System.out.println(t);
	}
}
class myComparator implements Comparator<String>{
	public int compare(String s1,String s2){
	// return s1.compareTo(s2); 
	// return s2.compareTo(s1); 
	return 1;
	} 

}