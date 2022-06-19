import java.util.*;
import java.util.Collections;
public class Names {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>(List.of("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));

        List<String> listWithoutDuplicate = new ArrayList<>(new HashSet<>(listOfNames));
        System.out.println("Listy bez duplikatów: " + listWithoutDuplicate);

        Collections.reverse(listOfNames);
        System.out.println("Elementy w odwrotnej kolejności: " + listOfNames);

        List<String> listAfterChanges = new ArrayList<>(List.of("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));
        listAfterChanges.set(0, "Joanna");
        listAfterChanges.set(4, "Joanna");
        System.out.println("List po zmianie " + listAfterChanges);

    }

}





