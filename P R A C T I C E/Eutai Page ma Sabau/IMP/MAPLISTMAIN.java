import java.util.*;

class Library {
    private int bookid;
    private String bookName;
    private String bookAuthor;

    Library(String nam, int id, String aut) {
        this.bookid = id;
        this.bookName = nam;
        this.bookAuthor = aut;
    }

    public int getId() {
        return bookid; 
    }

    public String getName() {
        return bookName; 
    }

    public String getAuthor() {
        return bookAuthor; 
    }
}

class LibraryList {
    public ArrayList<Library> item() {    
        ArrayList<Library> al = new ArrayList<>();
        al.add(new Library("Khai k v1", 1, "hmm"));
        al.add(new Library("Khai k v2", 2, "hmm2"));
        al.add(new Library("Khai k v3", 3, "hmm3"));
        al.add(new Library("Khai k v4", 4, "hmm4"));
        return al;
    }
}

class MAPLISTMAIN{
    public static void main(String[] args) -{
        LibraryList ob = new LibraryList();
        Map<String, ArrayList<Library>> mp = new HashMap<>();
        mp.put("Fiction", ob.item());

        System.out.println("");    
        System.out.println("||||||||||xxxxxx LIBRARY xxxxxx ||||||||||");
        System.out.println("");

        for (String category : mp.keySet()) {
            System.out.println("Category: " + category);
            System.out.println("Name \t\t  ID \t Author \t \t\t ");

            ArrayList<Library> libraries = mp.get(category);
            for (Library lib : libraries) {
                System.out.println(lib.getName() + "\t" + lib.getId() + "\t" + lib.getAuthor());
            } 
            System.out.println();
        }
    }
}