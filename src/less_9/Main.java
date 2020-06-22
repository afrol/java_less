package less_9;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        BoxContainer <GiftBox> container = new BoxContainer<>();
        container.add(new GiftBox("Flowers"));
        container.add(new GiftBox("Dolls"));
        container.add(new GiftBox("Horses"));

        Consumer<GiftBox> boxConsumer = box -> System.out.println("Zipping box " + box.getName());
        Consumer<Object> objConsumer = box -> System.out.println("Zipping box " + box.toString());
        container.zip(boxConsumer);
        container.zip(objConsumer);
    }
}
