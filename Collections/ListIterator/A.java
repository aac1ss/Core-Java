import java.util.*;
class A{
	public static void main(String[] args){
	LinkedList l=new LinkedList();
	l.add("asjisj0");
	l.add("asjisj1");
	l.add("asjisj2");
	l.add("asjisj3");
	l.add("asjisj4");
	System.out.println(l);
	ListIterator ltr=l.listIterator();
	while(ltr.hasNext()){
	String s=(String)ltr.next();
	if(s.equals("asjisj0")){
	ltr.remove();
	}
	else if(s.equals("asjisj1")){
	ltr.add("add");
	}
	else if(s.equals("asjisj2")){
	ltr.set("hi");
	}
	System.out.println(l);
	}
	}
}