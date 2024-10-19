// Wap to count number of repeated letters:

class Repeated{
	static int fac(int r){
		if(r==0 || r==1){
		return 1;
		}else{
			return r+fac(r-1);
			}	
	}
		
	public static void main(String[] args){
		int re=100;
		int ree=fac(re);
		System.out.println("The factorial is "+ree);
	
	}
}