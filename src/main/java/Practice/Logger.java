package Practice;

import org.slf4j.LoggerFactory;

public class Logger {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);

	public static void main(String[] args) {
		logger.warn("This is warn");
		logger.info("This is info");
		logger.debug("This is debug");
		
	}
}
