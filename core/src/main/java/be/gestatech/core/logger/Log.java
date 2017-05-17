package be.gestatech.core.logger;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by amuri on 5/17/2017.
 */
@Named
public class Log {

    @Inject
    private Logger logger;

    public Log() {
    }

    public Log(Logger logger) {
        this.logger = logger;
    }

    public void all(String message) {
        this.logger.log(Level.ALL, message);
    }

    public void severe(String message) {
        this.logger.log(Level.SEVERE, message);
    }

    public void warning(String message) {
        this.logger.log(Level.WARNING, message);
    }

    public void info(String message) {
        this.logger.log(Level.INFO, message);
    }

    public void config(String message) {
        this.logger.log(Level.CONFIG, message);
    }

    public void fine(String message) {
        this.logger.log(Level.FINE, message);
    }

    public void finer(String message) {
        this.logger.log(Level.FINER, message);
    }

    public void finest(String message) {
        this.logger.log(Level.FINEST, message);
    }
}
