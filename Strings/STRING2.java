class Strring{
	public static void main(String[] args){
	String s1= new String("hellp");
	String r= " ";	
	System.out.println("the Current string is :"+s1);	
for(int i=0;i<s1.length();i++){
	r=s1.charAt(i)+r;
			
}
	System.out.println("the reversed string is :"+r);
	}

}