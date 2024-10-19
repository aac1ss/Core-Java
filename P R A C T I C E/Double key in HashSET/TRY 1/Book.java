import java.util.Objects;

class Book {
    private int bookId;
    private String bookName;
    private int bookPrice;

    Book(int bookId, String bookName, int bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Book b = (Book) o;
        return this.bookId == b.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }

    @Override
    public String toString() {
        return "ID: " + bookId + " Name: " + bookName + " Price: " + bookPrice;
    }
}