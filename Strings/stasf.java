class Last{
	public static void main(String[] args){
	String str="AshishaishfaSAiasfia";
	str=str.toLowerCase();
	int[] count= new int[256];
	for(int i=0;i<str.length();i++){
		char strNew=str.charAt(i);
		count[strNew]++;
	}
	for(int i=0;i<strNew.length;i++){
	if(count[i]>2){
	System.out.println("the most repeated number is"+(char)i+"repeated"+count[i]+"times");
	}



}



}
}