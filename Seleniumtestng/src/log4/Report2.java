package log4;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Report2 {
	@Test
	public void test1() throws IOException
	{
		PatternLayout layout = new PatternLayout("%d %c %m %n");
		FileAppender app = new FileAppender(layout,"./reports/r1.log");
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(this.getClass().getName());
		log.warn("warn");
		log.error("error");
		log.info("info");
	}

}
