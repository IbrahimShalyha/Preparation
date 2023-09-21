package loggingframework;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Demo {
	public static Logger log = Logger.getLogger(Demo.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("INFORMATION");
		log.warn("WARNING");
		log.error("ERROR");
		log.fatal("FATAL");
		log.debug("DEBUG");

	}

}
