package log4;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Reports1 {
	@Test
	public void test1() {
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(this.getClass().getName());
		log.warn("warn");
		log.error("error");
		log.info("info");
	}

}
