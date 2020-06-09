package less_5.pet;

import less_5.passenger.Human;
import less_5.transport.Passenger;

/**
 * Базовый класс для живтоных
 * Имеет имя, тип, вес
 * Связывает животное с хозяином
 */
abstract public class BasePet implements Passenger {
    private final int MAX_WEIGHT = 100;

    private final String name;
    private final String type;
    private final int weight;
    private Human human;

    public BasePet(String name)
    {
        this.name = name;
        this.type = getType();
        this.weight = getWeight();
    }

    public BasePet(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
        this.type = getType();
    }

    abstract protected String getType();
    abstract protected int getWeight();

    @Override
    public boolean gotToBus(String busName) {
        if (canUsedTransport()) {
            System.out.println(
                type + " "
                + name
                + ", Хозяин " + human.getName() + ","
                + " зашел в автобус " + busName);
        } else {
            System.out.println("Доступ запрещен: " + type + " " + name);
            return false;
        }

        return true;
    }

    @Override
    public void gotOffBus()
    {
        System.out.println(name + " вышел из автобуса");
    }

    /**
     * Проверяет возможность поездки животного
     * @return boolean
     */
    private boolean canUsedTransport()
    {
        return human != null && weight <= MAX_WEIGHT;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Human getHuman()
    {
        return human;
    }
}
