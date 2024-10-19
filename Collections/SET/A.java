import java.util.*;
class A{
	public static void main(String args[]){
	TreeSet<Integer> t=new TreeSet<>(new B());
	t.add(17);
	t.add(253);
	t.add(33);
	t.add(86);
	t.add(45);
	t.add(68);
	System.out.println(t);
	}
}
class B implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2){
	return i2.compareTo(i1);
	}

}