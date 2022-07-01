import java.util.*;
import java.util.Collections;

public class Names {

    List<String> listOfNames = List.of("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");
    Set<String> listWithoutDuplicate = new HashSet<>(listOfNames);
    List<String> listAfterChanges = new ArrayList<>(listOfNames);

    public void printListAfterChanges(String existValue, String newValue) {
        Collections.replaceAll(listAfterChanges, existValue, newValue);
        System.out.println(listAfterChanges);
    }

}




