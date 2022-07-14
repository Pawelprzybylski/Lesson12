import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Janek", "Kowalski", 1990, 180, 92));
        people.add(new Person("Michał", "Nowak", 1995, 190, 82));
        people.add(new Person("Ania", "Ibisz", 1980, 170, 55));


        Collections.sort(people, (Person o1, Person o2) -> Integer.compare(o2.getWeight(), o1.getWeight()));

        System.out.println("\n" + "Sortowanie osób od najcięższej do najlżejszej " + "\n");

        for (Person sortedPerson : people) {
            System.out.println(sortedPerson);
        }

        Collections.sort(people, Comparator.comparingInt(Person::getHeight));

        System.out.println("\n" + "Sortowanie osób od najniższej do najwyższej " + "\n");

        for (Person sortedPerson : people) {
            System.out.println(sortedPerson);
        }

        System.out.println("\n" + "Sortowanie osób od najmłodszej do najstarszej " + "\n");

        Collections.sort(people);
        for (Person sortedPerson : people) {
            System.out.println(sortedPerson);
        }

    }

}
