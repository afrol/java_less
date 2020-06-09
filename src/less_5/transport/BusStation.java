package less_5.transport;

/**
 * Остановки автобуса
 * Имеют имя и расстояние от предыдущей остановки
 */
public class BusStation {
    private final String name;
    private final double distance;

    public BusStation(String name, double distance)
    {
        this.distance = distance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }
}
