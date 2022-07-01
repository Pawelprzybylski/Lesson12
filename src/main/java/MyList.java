import java.util.*;
public class MyList implements OwnList {

    List<Integer> ownList = new ArrayList<>();

    @Override
    public int size() {
        return ownList.size();
    }

    @Override
    public boolean isEmpty() {
        return ownList.isEmpty();
    }

    @Override
    public void add(Integer element) throws ArrayIndexOutOfBoundsException {
        ownList.add(element);
    }

    @Override
    public Integer get(int i) throws ArrayIndexOutOfBoundsException {
        return ownList.get(i);
    }

    @Override
    public void add(int index, Integer element) throws ArrayIndexOutOfBoundsException {
        ownList.add(index, element);
    }

    @Override
    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        List<Integer> newList = new ArrayList<>(new HashSet<>(ownList));

        for (Integer integer : ownList) {
            if (newList.contains(integer)) {
                ownList.remove(index);
            }
        }

    }

}


