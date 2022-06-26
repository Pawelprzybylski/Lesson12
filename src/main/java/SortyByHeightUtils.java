import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortyByHeightUtils {

    public static void sortTreeByHeight() {
        Set<Person> personHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }

        });

        personHeight.add(new Person("Janek", "Kowalski", 1990, 180, 92));
        personHeight.add(new Person("Michał", "Nowak", 1995, 190, 82));
        personHeight.add(new Person("Ania", "Ibisz", 1980, 170, 55));

        for (Person person : personHeight) {
            System.out.println("Imię " + person.getName() + " Nazwisko " + person.getSurname() +
                    " Rok urodzenia " + person.getYearBrith() + " Wzrost " + person.getHeight() + " Waga " + person.getWeight());
        }

    }

}
