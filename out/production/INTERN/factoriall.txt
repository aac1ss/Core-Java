// Wap to factorial of a number

class fact{
	static int fac(int r){
		if(r==0 || r==1){
		return 1;
		}else{
			return r*fac(r-1);
			}	
	}
		
	public static void main(String[] args){
		int re=3;
		int ree=fac(re);
		System.out.println("The factorial is "+ree);
	
	}
}