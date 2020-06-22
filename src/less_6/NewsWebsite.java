package less_6;

public class NewsWebsite extends Newspaper {
    public NewsWebsite(String color, int height, int weight) {
        super(color, height, weight);
        name = "Новостной сайт";
    }

    @Override
    public void open() {
        browser();
        super.open();
    }

    private void browser() {
        System.out.println("Запущен браузер.");
    }
}
