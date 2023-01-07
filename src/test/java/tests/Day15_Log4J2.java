package tests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Day15_Log4J2 {
//    Create object

    private static Logger logger = LogManager.getLogger(Day15_Log4J2.class.getName());
    @Test
    public void log4jTest(){
//        Use logger object to log/print information
      logger.fatal("Fatal log !!!!");//PRINTS BY DEFAULT
      logger.error("Error log !!!!");//PRINTS BY DEFAULT
      logger.warn("Warning log !!!!");
      logger.debug("Debug log !!!!");
      logger.info("Info log !!!!");
    }
}