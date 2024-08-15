import java.util.Objects;
public class Main {
    public static class Author {
        private String firstName;
        private String secondName;

        public Author(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Author author = (Author) o;
            return firstName.equals((author.firstName)) && secondName.equals(author.secondName);

        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(secondName);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        @Override
        public String toString() {
            return this.getFirstName() + " " + this.getSecondName();
        }
    }
    public static class Book {
        private String bookTitle;
        private Author nameOfAuthor;
        private int publicationYear;
        public Book (String bookTitle, Author nameOfAuthor, int publicationYear) {
            this.bookTitle = bookTitle;
            this.publicationYear = publicationYear;
            this.nameOfAuthor = nameOfAuthor;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return  true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return bookTitle.equals(book.bookTitle) && nameOfAuthor.equals(book.nameOfAuthor) && publicationYear == book.publicationYear;

        }
        @Override
        public int hashCode() {
            return java.util.Objects.hash(bookTitle);
        }
        public String getBookTitle() {
            return bookTitle;
        }
        public int getPublicationYear() {
            return publicationYear;
        }
        public Author getNameOfAuthor(){
            return nameOfAuthor;
        }
        public void setPublicationYear(int publicationYear){
            this.publicationYear = publicationYear;
        }
        @Override
        public String toString () {
            return "Книга: " + this.getBookTitle() + ", автор: " + this.getNameOfAuthor() + ", год издания:" + this.getPublicationYear();
        }
    }
    public static void main(String[] args) {
        Author besson = new Author("Люк", "Бессон");

        Book childhood = new Book("Артур и минипуты", besson, 2002);
        System.out.println(childhood);
        System.out.println(childhood.getNameOfAuthor().getFirstName() + " " + childhood.getNameOfAuthor().getSecondName());
        System.out.println(childhood.getBookTitle() +" " + childhood.getPublicationYear());
        childhood.setPublicationYear(2002);
        System.out.println(childhood.getPublicationYear());

        Author freud = new Author("Зигмунд", "Фрейд");
        Book onegin = new Book("Толкование сновидений", freud, 1913);
        System.out.println(onegin.getNameOfAuthor().getFirstName() + " " + onegin.getNameOfAuthor().getSecondName());
        System.out.println(onegin.getBookTitle() + " " + onegin.getPublicationYear());
        System.out.println(childhood.getPublicationYear()==onegin.getPublicationYear());
        System.out.println(childhood.equals((onegin)));
        System.out.println(besson.equals(freud));
    }
}