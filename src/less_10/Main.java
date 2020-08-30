package less_10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        String phoneBookName = "phone_book";

        ArrayList<Contact> phoneBook = fileManager.load(phoneBookName);
        if (phoneBook.size() > 0) {
            System.out.println("Телефонная книга загружена");
            String searchName = "Alex";
            System.out.println("Поиск по имени: " + searchName);

            if (find(searchName, phoneBook) != null) {
                System.out.println("Найдет");
            } else {
                System.out.println("Нет совпадений");
            }

            phoneBook.sort(Comparator.comparing(Contact::getName));
            System.out.println("sorted by name = " + phoneBook);
        }

        System.out.println("Добавить контакт Bob в тел книгу");
        phoneBook.add(new Contact(
                "Bob",
                LocalDate.of(2000, 2, 12),
                "London, 1"
        ));

        System.out.println("Создать новый контакт: Alex");
        Contact contact2 = new Contact(
                "Alex",
                LocalDate.of(2010, 2, 12),
                "London, 2"
        );

        System.out.println("Добавить Alex номер телефона: 1231231");
        contact2.addPhone("1231231");

        System.out.println("Добавить контакт Alex в тел книгу");
        phoneBook.add(contact2);

        System.out.println("Удалить из тел книги: " + phoneBook.get(1).getName());
        phoneBook.remove(1);

        System.out.println("Сохранить тел книгу:");
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
