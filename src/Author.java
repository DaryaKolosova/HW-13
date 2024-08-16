public class Author {
    private String name;
    private String surname;

    public Author(String nameAuth, String surnameAuth) {
        this.name=nameAuth;
        this.surname=surnameAuth;
    }
    public String getAuthorName() {
        return name;
    }
    public String getAuthorSurname() {
        return surname;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return surname.equals(c2.surname) && name.equals(c2.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(surname + name);
    }

    @Override
    public String toString() {
        return name + ": " + surname;
    }
}
