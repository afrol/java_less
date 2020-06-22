package less_6;

public class Book extends Paper {
    public Book(String color, int height, int weight) {
        super(color, height, weight);
        super.name = "Книга";
    }
}
