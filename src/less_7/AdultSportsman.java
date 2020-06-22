package less_7;

public class AdultSportsman extends Sportsman implements Run, Shoot{
    AdultSportsman(String name) {
        super(name);
    }

    @Override
    public void goRun() {
        System.out.println("Спортсмен " + getName() + " бегает");
    }

    @Override
    public void goShoot() {
        System.out.println("Спортсмен " + getName() + " стреляет");
    }
}
