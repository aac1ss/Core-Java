class Main{
	public static void main(String[] args) {
		validate val=Book::valid;
		Book b1=new Book();
		Book b2=new Book();
		b2.setId(1);
		b2.setName("Hari Puttar");
		b2.setPrice(42.70);
	 try {
            System.out.println(val.validation(b1)); 
        } catch (BadBookContentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
   try {
            System.out.println(val.validation(b2)); 
        } catch (BadBookContentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}