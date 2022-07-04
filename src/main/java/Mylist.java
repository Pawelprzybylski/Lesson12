public class Mylist {

    String[] list = new String[5];

    public void addElementToEnd(String element) {
        list[list.length - 1] = element;
    }

    public void addElement(int index, String element) {
        list[index] = element;
        if (index > list.length) {
            throw new RuntimeException();
        }
    }

    public void removeElement(int index) {
        if (index > list.length) {
            throw new RuntimeException();
        }
        for (int i = index; i < list.length; i++) {
            list[i] = list[i + 1];
        }
    }

    public int getLength() {
        return list.length;
    }

}




