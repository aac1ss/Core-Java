class Test{
public static void main(String[] args){
String r="Ashish";
String r1=new String("Ashish");
String r2=new String("Ashish");
String r3="Ashish";
String r4="Ash";
	System.out.println(r==r1);      // false
	System.out.println(r1==r2);   // false 
	System.out.println(r2==r3);   // false
	System.out.println(r3==r);     // true
	System.out.println(r4==r);     // False

	System.out.println(r.equals(r1));      // True
	System.out.println(r1.equals(r2));   // True 
	System.out.println(r2.equals(r3));   // True
	System.out.println(r3.equals(r));     // True
	System.out.println(r4.equals(r));     // False


}
}