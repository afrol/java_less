package less_5;

import less_5.passenger.Human;
import less_5.pet.Dog;
import less_5.pet.Elephant;
import less_5.transport.Bus;
import less_5.transport.BusStation;
import less_5.transport.Route;

public class Main {
    public static void main(String[] args) {
        Route route = new Route(101);
        route.addStation(new BusStation("Вокзал", 0));
        route.addStation(new BusStation("Озерка", 2));
        route.addStation(new BusStation("Парк", 4));
        route.addStation(new BusStation("Центр", 5));
        route.addStation(new BusStation("Набережная", 10));
        route.addStation(new BusStation("Конечная", 25));

        Bus bus = new Bus("Спринтер", route);
        bus.go(1);
        bus.stop();

        Human donald = new Human("Donald");
        bus.getIn(donald);
        Dog donaldDog = new Dog("Reks");
        donaldDog.setHuman(donald);
        bus.getIn(donaldDog);

        bus.go(2);
        bus.stop();
        bus.getIn(new Elephant("Bimbo"));

        bus.go(3);
        bus.stop();

        bus.getOut(donaldDog);
        bus.getOut(donald);

        bus.getIn(new Human("Bob"));
        bus.getIn(new Human("Tom"));
        bus.getIn(new Human("Jack"));
        bus.getIn(new Human("Ivan"));

        bus.go(5);
        bus.stop();
        bus.exitAll();
    }
}
