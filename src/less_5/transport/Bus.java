package less_5.transport;

import less_5.Print;

/**
 * Транспортное средство для перевозки пасажиров
 * Имеет имя, заданный путь и кондуктора для проверки пассажиров
 */
public class Bus {
    private final String name;
    private final Route route;
    private final Conductor conductor;

    private int previousStationId;
    private int currentStationId;

    public Bus(String name, Route route)
    {
        this.name = name;
        this.route = route;

        conductor = new Conductor(name);
    }

    public void getIn(Passenger passenger)
    {
        try {
            conductor.add(passenger);
        } catch (Exception e) {
            Print.ln(e.getMessage());
        }
    }

    public void getOut(Passenger passenger)
    {
        conductor.rm(passenger);
    }

    public void exitAll()
    {
        conductor.clear();

        Print.ln("Все вышли. Коичество пассажиров: " + conductor.getPassengerNumber());
    }

    public void go(int stationId)
    {
        previousStationId = currentStationId;
        currentStationId = stationId;

        Print.ln(
                "автобус " + name + " # " + route.getId()
                        + " поехал к остановке " + getStation(stationId).getName()
        );

        Print.ln("Коичество пассажиров: " + conductor.getPassengerNumber());
    }

    public void stop()
    {
        double distance = 0;
        if (previousStationId > 0) {
            distance = getStation(currentStationId).getDistance() - getStation(previousStationId).getDistance();
        }

        System.out.println(
                "автобус " + name
                + " приехал к остановке " + getStation(currentStationId).getName()
                + (distance > 0 ? ". Дистанция " + distance + "km" : "")
        );
    }

    private BusStation getStation(int id) {
        return route.getStation(id);
    }
}
