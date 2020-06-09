package less_5.transport;

import less_5.pet.BasePet;

import java.util.ArrayList;
import java.util.List;

/**
 * Кодуктор - управляет пассажиропотоком
 * Закрепляется за автобусом (название автобуса)
 * Проверяет на входе всех пассажиров за правилами
 */
public class Conductor {
    List<Passenger> passengers = new ArrayList<>();
    private final String busName;

    public Conductor(String busName)
    {
        this.busName = busName;
    }

    public void add(Passenger passenger) throws Exception {
        if (passenger.gotToBus(busName)) {
            if (passenger instanceof BasePet) {
                if (!passengers.contains(((BasePet) passenger).getHuman())) {
                    throw new Exception("Нарушение погрузки!!! Хозян не зашел");
                }
            }

            passengers.add(passenger);
        } else {
            throw new Exception("Нарушение погрузки!!!");
        }
    }

    public void rm(Passenger passenger)
    {
        passenger.gotOffBus();
        passengers.remove(passenger);
    }

    public void clear()
    {
        passengers.clear();
    }

    /**
     * @return int
     */
    public int getPassengerNumber()
    {
        return passengers.size();
    }
}
