import java.util.Objects;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Author besson = new Author("Люк", "Бессон");
        Author freud = new Author("Зигмунд", "Фрейд");
        System.out.println("Бессон.name = " + besson.getAuthorName() + " " + besson.getAuthorSurname());
        Book ArthurAndTheMinimoys = new Book("Артур и Минипуты", besson, 2002);
        Book DreamInterpretation = new Book("Толкование сновидений", freud, 1913);
        System.out.println("Besson.name = " + besson.getAuthorName() + " " + besson.getAuthorSurname() + " " + ArthurAndTheMinimoys.getBookName() + "  " + ArthurAndTheMinimoys.getBookYear());
        System.out.println("Freud.name = " + freud.getAuthorName() + " " + freud.getAuthorSurname() + " " + DreamInterpretation.getBookName() + "  " + DreamInterpretation.getBookYear());
        DreamInterpretation.setBookYear(2010);
        System.out.println(DreamInterpretation.getBookName() + "  было переиздано в  " + DreamInterpretation.getBookYear() + " году");
        System.out.println(freud.equals(besson));
        System.out.println(freud.equals(freud));
        System.out.println("freud hash" + freud.hashCode());
        System.out.println(freud.toString());
    }
}