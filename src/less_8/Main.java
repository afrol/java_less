package less_8;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = (new Logging("test_exception")).logger();

        try {
            System.out.println("Find record");
            throw new NotFoundException("Record not found");
        } catch (NotFoundException e) {
            log.severe(e.getMessage());
        }

        try {
            System.out.println("Divide 10 / 0!");
            throw new DivideByZeroExcretion(10);
        } catch (DivideByZeroExcretion e) {
            log.severe(e.getMessage());
        }
    }
}
