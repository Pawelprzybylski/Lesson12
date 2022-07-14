import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>(Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));
        System.out.println("Lista wejściowa " + listOfNames);

        Set<String> listWithoutDuplicate = new HashSet<>(listOfNames);
        System.out.println("Lista bez duplikatów: " + listWithoutDuplicate);

        Collections.reverse(listOfNames);
        System.out.println("Elementy w odwrotnej kolejności " + listOfNames);

        Collections.replaceAll(listOfNames, "Anna", "Joanna");
        System.out.println("Elementy po zmianie: Anna-> Joanna: " + "\n" + listOfNames);

    }

}
