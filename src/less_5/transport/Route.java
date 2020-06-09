package less_5.transport;

import java.util.ArrayList;
import java.util.List;

/**
 * Маршрут следования автобуса по списку остановок
 */
public class Route {
    private final int id;
    List<BusStation> stations = new ArrayList<>();

    public Route (int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addStation(BusStation station)
    {
        stations.add(station);
    }

    public BusStation getStation(int id)
    {
        return stations.get(id);
    }
}
