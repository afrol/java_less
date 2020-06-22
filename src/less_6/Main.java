package less_6;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("less_6.EBook");
        Constructor constructor = clazz.getConstructor(String.class, int.class, int.class);
        Paper ebook = (Paper) constructor.newInstance("black", 20,10);

        Paper[] papers = new Paper[] {
                new Book("red", 10,10),
                new Notebook("white", 15, 15),
                ebook
        };

        for(Paper paper : papers){
            paper.open();
        }
    }
}
