public class Book {
    private String bookName;
    private Author bookAuth;
    private int bookYear;

    public Book(String book, Author bookAuthor, int pubYear) {
        this.bookName = book;
        this.bookAuth = bookAuthor;
        this.bookYear = pubYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getBookAuth() {
        return bookAuth;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @ Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return bookName.equals(c2.bookName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
    @Override
    public String toString() {
        return bookName + ": " + bookAuth+": "+bookYear;
    }
}
