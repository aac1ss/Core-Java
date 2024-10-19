public class Library{

	class Book{

		private String title;
		private String author;

		Book(String title,String author){
			this.title=title;
			this.author=author;
		}

		String getTitle(){
			return title ;
		}

		String getAuthor(){
			return author;
		}

		 public void displayDetails() {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
        }
	}

	static class LibraryInfo{
		private String name;
        private String location;

        public LibraryInfo(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public void displayInfo() {
            System.out.println("Library Name: " + name);
            System.out.println("Location: " + location);
        }
	}

}

 class Main{
	public static void main(String[] args){
		Library lib=new Library();
		Library.Book book=lib.new Book("Harry Puttar","Hari Bahadur");
		book.displayDetails();
		Library.LibraryInfo libraryinfo=new Library.LibraryInfo("Hari Library","Kupondole");
		libraryinfo.displayInfo();
	}
}