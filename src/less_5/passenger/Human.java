package less_5.passenger;

import less_5.transport.Passenger;

/**
 * Пассажир - человек
 * Имеет свое имя
 * Возможность зайти, покинуть автобус
 */
public class Human implements Passenger
{

    private final String name;

    public Human(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean gotToBus(String busName)
    {
        System.out.println(name + " зашел в автобус " + busName);
        return true;
    }

    @Override
    public void gotOffBus()
    {
        System.out.println(name + " вышел из автобуса");
    }
}
