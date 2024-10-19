class recur{
	static int sum(int k){
		if(k>0){
		return k+sum(k-1);
		}else{
		return 0;
		}
	}
	static int fact(int r){
		if(r==0){
		return 1;				
		}
		else if(r<0) {
			return 0;
		}
		else {
			int factor =1;
			for(int i=1; i<=r;i++){
			factor=factor*i;
			}return factor;
		}
	}
	public static void main(String[] args){
	int result=sum(10);
	int fresult=fact(5);
	System.out.println("The sum of till is : "+ result);
	System.out.println("The factorial is : "+fresult);
	}
}