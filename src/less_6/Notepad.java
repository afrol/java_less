package less_6;


public class Notepad extends Paper {
    public Notepad(String color, int height, int weight) {
        super(color, height, weight);
        name = "Блокнот";
    }

    @Override
    public String toString() {
        return "Notepad";
    }
}
