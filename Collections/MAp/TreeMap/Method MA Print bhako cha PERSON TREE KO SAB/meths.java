import java.util.*;

class meths{
	public void treehashMp(){
	Map<Integer,Person> hashMap=new HashMap<>();
	hashMap.put(1,new Person("Ass1",20));
	hashMap.put(8,new Person("Ass8",18));
	hashMap.put(6,new Person("Ass6",17));
	hashMap.put(2,new Person("Ass2",21));
	hashMap.put(4,new Person("Ass4",25));
	System.out.println("\tHASHMAP");
	
	for(Map.Entry<Integer,Person> entry: hashMap.entrySet()){
	System.out.println("|"+"Key: "+"|"+entry.getKey()+"|"+" "+entry.getValue()+"|");
	}
	}
	
	public void treeLinkedHashMp(){
	Map<Integer,Person> LnkdhashMap=new LinkedHashMap<>();
	LnkdhashMap.put(1,new Person("Ass1",20));
	LnkdhashMap.put(8,new Person("Ass8",18));
	LnkdhashMap.put(6,new Person("Ass6",17));
	LnkdhashMap.put(2,new Person("Ass2",21));
	LnkdhashMap.put(4,new Person("Ass4",25));
	System.out.println("\tLINKEDHASHMAP");
	
	for(Map.Entry<Integer,Person> entry: LnkdhashMap.entrySet()){
	System.out.println("|"+"Key: "+"|"+entry.getKey()+"|"+" "+entry.getValue()+"|");
	}
	}
	public void treeMp(){
	Map<Integer,Person> tereMap=new TreeMap<>();
	tereMap.put(1,new Person("Ass1",20));
	tereMap.put(8,new Person("Ass8",18));
	tereMap.put(6,new Person("Ass6",17));
	tereMap.put(2,new Person("Ass2",21));
	tereMap.put(4,new Person("Ass4",25));
	System.out.println("\tTREE MAP");
	for(Map.Entry<Integer,Person> entry: tereMap.entrySet()){
	System.out.println("|"+"Key: "+entry.getKey()+"Value"+entry.getValue());
	}
	}
}