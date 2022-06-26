import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortyByWeightUtils {

    public static void sortTreeByWeight() {
        Set<Person> personWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.getWeight(), o1.getWeight());
            }

        });

        personWeight.add(new Person("Janek", "Kowalski", 1990, 180, 92));
        personWeight.add(new Person("Michał", "Nowak", 1995, 190, 82));
        personWeight.add(new Person("Ania", "Ibisz", 1980, 170, 55));

        for (Person person : personWeight) {
            System.out.println("Imię " + person.getName() + " Nazwisko " + person.getSurname() +
                    " Rok urodzenia " + person.getYearBrith() + " Wzrost " + person.getHeight() + " Waga " + person.getWeight());
        }

    }

}
