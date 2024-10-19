import java.util.*;
class LinkedLst {
	public static void main(String[] args){
	LinkedList<String> l=new LinkedList<>();
	l.addFirst("A");
	l.add("B");
	l.add("V");
	l.addLast("V");
	System.out.println(l);

	for(int i=0;i<l.size();i++){
	
	if(l.get(i)=="z"){   //SearchingTheLetterOrWordIntheList
	System.out.println("The letter is in"+i+" index");	
	}else
	
	System.out.println(l.get(i));
	}
}}