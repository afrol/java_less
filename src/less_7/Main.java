package less_7;

public class Main {
    public static void main(String[] args) {
        AdultSportsman sportsman = new AdultSportsman("Tom");
        sportsman.goRun();
        sportsman.goShoot();

        System.out.println();

        JuniorSportsman sportsman2 = new JuniorSportsman("Bob");
        sportsman2.goJump();
        sportsman2.goSwim();
    }
}
