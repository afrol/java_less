package less_10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        String phoneBookName = "phone_book";

        ArrayList<Contact> phoneBook = fileManager.load(phoneBookName);

        System.out.println("contains Name: " + Objects.requireNonNull(find("Alex", phoneBook)).getName());

        phoneBook.sort(Comparator.comparing(Contact::getName));
        System.out.println("sorted by name = " + phoneBook);


        phoneBook.add(new Contact(
                "Bob",
                LocalDate.of(2000, 2, 12),
                "London, 1"
        ));

        Contact contact2 = new Contact(
                "Alex",
                LocalDate.of(2010, 2, 12),
                "London, 2"
        );

        contact2.addPhone("1231231");

        phoneBook.add(contact2);
        phoneBook.remove(1);

        System.out.println(phoneBook);
        fileManager.write(phoneBookName, phoneBook);
    }

    private static Contact find(String q, ArrayList<Contact> phoneBook) {
        for(Contact item : phoneBook) {
            if(item.getName().equals(q)) {
                return item;
            }
        }
        return null;
    }
}
