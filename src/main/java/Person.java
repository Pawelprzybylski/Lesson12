public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int yearBrith;
    private int height;
    private int weight;

    public Person(String name, String surname, int yearBrith, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.yearBrith = yearBrith;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearBrith() {
        return yearBrith;
    }

    public void setYearBrith(int yearBrith) {
        this.yearBrith = yearBrith;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(person.getYearBrith(), this.getYearBrith());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearBrith=" + yearBrith +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
