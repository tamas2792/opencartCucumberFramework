import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

/**
 * https://yujiorama.github.io/unofficial-translations/logback-manual/03-configuration.html
 */
public class LoggerContextConfigurator {

    public static void configure() {
        configure("Include/config/logback-file.xml");
    }

    public static void configure(String xml) {
        LoggerContext context = (LoggerContext)LoggerFactory.getILoggerFactory();
        try {
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(context);

            //context.reset()
            configurator.doConfigure(xml);
        } catch (JoranException je) {
            // StatusPrinter will handle this
        }
        StatusPrinter.printInCaseOfErrorsOrWarnings(context);
    }
}