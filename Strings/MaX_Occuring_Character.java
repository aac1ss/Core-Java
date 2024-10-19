class CharacterCount {
    public static void main(String[] args) {
	String str="asasaDSAa aasas";      
	 str = str.toLowerCase();
        	int[] count = new int[256]; 
        	for (int i = 0; i < str.length(); i++) {
       	     char currentChar = str.charAt(i);
            	count[currentChar]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) { 
 	System.out.println((char) i + " is repeated " + count[i] + " times");
            }
        }
    }
}