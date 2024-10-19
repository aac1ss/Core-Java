class StringConst{ 
 public static void main(String[] args){
  String s1="Ashish Thapa";
String s122="Ashish Thapa";
  String s2="   A s h i s h";
  String s3="reyna";
String io="a";
String io2="A";
	System.out.println(io.compareTo(io2)); 	
            System.out.println(io.compareToIgnoreCase(io2)); 	
                        

System.out.println(s1); 	
            System.out.println(s2); 	
            System.out.println(s3);
            System.out.println(s1.equalsIgnoreCase(s2));

            System.out.println(" "); 	
 
           System.out.println(" UPPER CASE & lower case ");
            System.out.println(s1.toUpperCase());
            System.out.println(s2.toLowerCase());
            System.out.println(s3);

          System.out.println("TRIM ");
            System.out.println(s2.trim());
	
           System.out.println("STARTS with & Ends With ");
            System.out.println(s1.startsWith("s"));
            System.out.println(s1.endsWith("a"));
 
           System.out.println("charAt ");
            System.out.println(s1.charAt(1));
            System.out.println(s1.charAt(5));
 
           System.out.println("Length");
            System.out.println(s1.length());

System.out.println("");  
	
System.out.println("ALL ABOUT INTERN MEthod");  
	String i1= new String("SOVA");
	String i2= new String( "SOVA");	 
	System.out.println(i1+"=="+i2);
 	System.out.println(i1==i2);
	String i11=i1.intern();
	String i12=i2.intern();
	System.out.println(i11+"=="+i12);
 	System.out.println(i11 == i12);
	
}
}