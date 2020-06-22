package less_9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BoxContainer <T extends Box> {
    private final List<T> boxes;

    public BoxContainer() {
        boxes = new ArrayList<>();
    }

    public void add(T box) {
        boxes.add(box);
    }

    public T get(int index) {
        return  boxes.get(index);
    }

    public void zip(Consumer<? super T> consumer) {
        for (T box: boxes) {
            consumer.accept(box);
        }
    }
}
