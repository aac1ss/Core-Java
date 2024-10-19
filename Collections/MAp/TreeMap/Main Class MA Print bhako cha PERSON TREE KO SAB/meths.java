import java.util.*;

class meths{
	public Map<Integer,Person> treehashMp(){
	Map<Integer,Person> hashMap=new HashMap<>();
	hashMap.put(1,new Person("Ass1",20));
	hashMap.put(8,new Person("Ass8",18));
	hashMap.put(6,new Person("Ass6",17));
	hashMap.put(2,new Person("Ass2",21));
	hashMap.put(4,new Person("Ass4",25));
	return hashMap;
	// System.out.println(hashMap);
	}
	public Map<Integer,Person> treeLinkedHashMp(){
	Map<Integer,Person> LnkdhashMap=new LinkedHashMap<>();
	LnkdhashMap.put(1,new Person("Ass1",20));
	LnkdhashMap.put(8,new Person("Ass8",18));
	LnkdhashMap.put(6,new Person("Ass6",17));
	LnkdhashMap.put(2,new Person("Ass2",21));
	LnkdhashMap.put(4,new Person("Ass4",25));
	return LnkdhashMap;
	// System.out.println(treeLinkedHashMap);
	}
	public Map<Integer,Person> treeMp(){
	Map<Integer,Person> tereMap=new TreeMap<>();
	tereMap.put(1,new Person("Ass1",20));
	tereMap.put(8,new Person("Ass8",18));
	tereMap.put(6,new Person("Ass6",17));
	tereMap.put(2,new Person("Ass2",21));
	tereMap.put(4,new Person("Ass4",25));
	return tereMap;
	//System.out.println(tereMap);
	}
}