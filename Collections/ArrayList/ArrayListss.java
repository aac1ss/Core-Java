import java.util.ArrayList;
class ArrayListss{
	public static void main(String[] args){
	ArrayList<Integer> list=new ArrayList<>();

	//add ELements
	list.add(0);
	list.add(20);
	list.add(2);
	System.out.println(list);
 	
	//Get Elemetns from  which index
	System.out.println(list.get(2));

	//TO add elements in between 
	list.add(1,1);
	System.out.println(list);
		
	//Set ELemets
	list.set(0,5);
	System.out.println(list);
	
	//Remove element
	list.remove(1);
	System.out.println(list);

	//Size
	int size=list.size();
	System.out.println(size);


	}


}