public class Main {

    public static void main(String[] args) {
        Names names = new Names();

        System.out.println("Lista " + names.listOfNames);
        System.out.println("Lista bez duplikatów " + names.listWithoutDuplicate);
        names.printListAfterChanges("Anna", "Joanna");

    }

}
