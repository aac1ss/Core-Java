class recur_fact{
	public static void main(String[] args){
		int result=rfact(5);
		System.out.println("THe factorial is: "+result);
	}

		public static int rfact(int r){
			if(r>0){
			int factor=1;
				for(int i=1;i<=r;i++){
				factor=factor*i;
				
				}return factor;
			} 
			else if(r<0){
				return 0;	
			}
			else {
				return 1;	
			}
				
		}


}