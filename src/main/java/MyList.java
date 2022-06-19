import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList implements OwnList {

    List<Integer> ownList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    @Override
    public int size() {
        return ownList.size();
    }

    @Override
    public boolean isEmpty() {
        return ownList.isEmpty();
    }

    @Override
    public void add(Integer element) {
        ownList.add(element);
    }

    @Override
    public Integer get(int i) {
        return ownList.get(i);
    }

    @Override
    public void add(int index, Integer element) {
        ownList.add(index, element);
    }

    @Override
    public Integer remove(int index) {
        return ownList.remove(index);
    }

}
