package nagp.Utils;


	import org.apache.logging.log4j.core.Logger;
	import org.apache.logging.log4j.LogManager;

	public class TestLogger {

		private static final Logger logger = (Logger) LogManager.getLogger(TestLogger.class);

		//method will log the information
		public static void info(String message) {
			long threadId = Thread.currentThread().getId();
			logger.info("Thread " + threadId + ": " + message);

		}
		
		//method will log the Error.
		public static void error(String message) {
			long threadId = Thread.currentThread().getId();
			logger.error("Thread " + threadId + ": " + message);
		}

		//method will log the Debug
		public static void debug(String message) {
			long threadId = Thread.currentThread().getId();
			logger.debug("Thread " + threadId + ": " + message);
		}

		//method will log the Warning
		public static void warn(String message) {
			long threadId = Thread.currentThread().getId();
			logger.warn("Thread " + threadId + ": " + message);
		}

		//method will log the Trace
		public static void trace(String message) {
			long threadId = Thread.currentThread().getId();
			logger.trace("Thread " + threadId + ": " + message);
		}

	}



