import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Janek", "Kowalski", 1990, 180, 92));
        person.add(new Person("Michał", "Nowak", 1995, 190, 82));
        person.add(new Person("Ania", "Ibisz", 1980, 170, 55));

        System.out.println("\n" + "Lista początkowa: " + "\n");

        for (Person sortedPerson : person) {
            System.out.println(" Name " + sortedPerson.getName() + " Surname " + sortedPerson.getSurname() + " birth year " + sortedPerson.getYearBrith() + " Height " + sortedPerson.getHeight() + " Weight " + sortedPerson.getWeight()
            );
        }

        Collections.sort(person, (Person o1, Person o2) -> Integer.compare(o2.getWeight(), o1.getWeight()));

        System.out.println("\n" + "Sortowanie osób od najcięższej do najlżejszej " + "\n");

        for (Person sortedPerson : person) {
            System.out.println(" Name " + sortedPerson.getName() + " Surname " + sortedPerson.getSurname() + " birth year " + sortedPerson.getYearBrith() + " Height " + sortedPerson.getHeight() + " Weight " + sortedPerson.getWeight()
            );
        }

        Collections.sort(person, (Person o1, Person o2) -> Integer.compare(o1.getHeight(), o2.getHeight()));

        System.out.println("\n" + "Sortowanie osób od najniższej do najwyższej " + "\n");

        for (Person sortedPerson : person) {
            System.out.println(" Name " + sortedPerson.getName() + " Surname " + sortedPerson.getSurname() + " birth year " + sortedPerson.getYearBrith() + " Height " + sortedPerson.getHeight() + " Weight " + sortedPerson.getWeight()
            );
        }

        Collections.sort(person, (Person o1, Person o2) -> Integer.compare(o2.getYearBrith(), o1.getYearBrith()));

        System.out.println("\n" + "Sortowanie osób od najmłodszej do najstarszej " + "\n");

        for (Person sortedPerson : person) {
            System.out.println(" Name " + sortedPerson.getName() + " Surname " + sortedPerson.getSurname() + " birth year " + sortedPerson.getYearBrith() + " Height " + sortedPerson.getHeight() + " Weight " + sortedPerson.getWeight()
            );
        }

    }
}
