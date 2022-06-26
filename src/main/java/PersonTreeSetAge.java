import java.util.Set;
import java.util.TreeSet;
public class PersonTreeSetAge {

    public static void SortyByAge() {

        Set<Person> personAge = new TreeSet<>();
        personAge.add(new Person("Janek", "Kowalski", 1990, 180, 92));
        personAge.add(new Person("Michał", "Nowak", 1995, 190, 82));
        personAge.add(new Person("Ania", "Ibisz", 1980, 170, 55));

        for (Person person : personAge) {
            System.out.println("Imię " + person.getName() + " Nazwisko " + person.getSurname() +
                    " Rok urodzenia " + person.getYearBrith() + " Wzrost " + person.getHeight() + " Waga " + person.getWeight());
        }

    }

}
