package loggingframework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo1 {
	public static Logger log = Logger.getLogger(Demo1.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("logging.properties");
		log.info("INFORMATION");
		log.warn("WARNING");
		log.error("ERROR");
		log.fatal("FATAL");
		log.debug("DEBUG");
	}
}
