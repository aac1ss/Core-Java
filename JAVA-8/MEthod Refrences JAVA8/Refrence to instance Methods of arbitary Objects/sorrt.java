import java.util.*;
class sorrt{
	public static void main(String[] args){
		String[] s={"Sova","Phoenix","Cypher","Breach","Lynx","Jett"};
	Arrays.sort(s,String::compareToIgnoreCase);
	for(String r:s){
	System.out.println(r);
	}

	}


}