package ucp.exemple;

public class Persons {
// inmutabilidad, constructor, solo getters.
    private final String name;
    private final int years;

    public Persons(String name , int years) {
        this.years = years;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
