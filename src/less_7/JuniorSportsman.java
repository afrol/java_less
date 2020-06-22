package less_7;

public class JuniorSportsman extends Sportsman implements Jump, Swim {
    JuniorSportsman(String name) {
        super(name);
    }

    @Override
    public void goSwim() {
        System.out.println("Мальчик " + getName() + " плавает");
    }

    @Override
    public void goJump() {
        System.out.println("Мальчик " + getName() + " прыгает");
    }
}
