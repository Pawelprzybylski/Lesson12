public class Main {
    public static void main(String[] args) {

        System.out.println("Sortowanie według wagi");
        SortyByWeightUtils.sortTreeByWeight();
        System.out.println("Sortowanie według wzrostu");
        SortyByHeightUtils.sortTreeByHeight();
        System.out.println("Sortowanie według wieku");
        PersonTreeSetAge.SortyByAge();

    }
}
