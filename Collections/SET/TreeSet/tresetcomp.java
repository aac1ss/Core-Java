import java.util.*;
class tresetcomp{
	public static void main(String[] args){
	TreeSet<Integer> t= new TreeSet<>(new myComparator());
	t.add(10);
	t.add(0);
	t.add(15);
	t.add(5);
	t.add(10);
	t.add(20);
	t.add(20);
	System.out.println(t);	
	}	
}	
class myComparator implements Comparator<Integer>{

		public int compare(Integer I1,Integer I2 ){
// Ascendding}	return I1.compareTo(I2);
// Descendding}	return I2.compareTo(I1);
// Descendding}	return -I1.compareTo(I2);
// Ascendding}	return -I2.compareTo(I1);
//Original order	return 1;
	return -1;

	}
}
