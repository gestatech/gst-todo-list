package be.gestatech.core.logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * Created by amuri on 5/17/2017.
 */
public class LoggerProducer {
    @Produces
    public Logger getLogger(final InjectionPoint point) {
        return Logger.getLogger(point.getClass().getSimpleName());
    }
}
