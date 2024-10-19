import java.util.*;
class Mapp{
	public static void main(String[] args){
	Map mp=new HashMap();
	mp.put(101,"Reyna");
	mp.put(102,"Breach");
	mp.put(103,"Raze");
	mp.put(104,"Jett");
	System.out.println(mp);
	mp.put(103,"Raaa");
	mp.remove(104);	
	System.out.println(mp);
	}
}
