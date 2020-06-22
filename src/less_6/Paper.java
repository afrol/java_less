package less_6;


import java.util.Objects;

abstract public class Paper {
    protected String name;
    protected final String color;
    protected final int height;
    protected final int weight;

    public Paper(String color, int height, int weight) {
        this.color = color;
        this.height = height;
        this.weight = weight;

        name = "Бумага";
    }

    public void open() {
        System.out.println("Открыт " + name + " цветом: " + color);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paper paper = (Paper) o;
        return Objects.equals(name, paper.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
