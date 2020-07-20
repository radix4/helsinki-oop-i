import java.util.Objects;

public class Bird {
    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(latinName, bird.latinName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, latinName);
    }

    @Override
    public String toString() {
        return name + " (" + latinName + ")";
    }
}
