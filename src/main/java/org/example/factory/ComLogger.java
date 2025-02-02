package org.example.factory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ComLogger {
    private static Logger logger= (Logger) LogManager.getLogger();
    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void fatal(String message) {
        logger.fatal(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }
}
