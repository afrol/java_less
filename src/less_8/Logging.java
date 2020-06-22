package less_8;

import java.io.IOException;
import java.util.logging.*;

public class Logging {
    private static final Logger LOGGER = Logger.getLogger(Logging.class.getName());

    public Logging(String name) {
        try {
            Handler fh = new FileHandler("/tmp/" + name + ".log");
            LOGGER.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

    }

    public Logger logger()
    {
        return LOGGER;
    }
}
