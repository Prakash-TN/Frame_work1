package ReporterTool;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	@Test
	public void test()
	{
		ExtentReports report=new ExtentReports("./Reports/r1.html",false);
		ExtentTest test = report.startTest("tc1");
		test.log(LogStatus.PASS,"tc passed");
		test.log(LogStatus.FAIL,"tc failed");
		test.log(LogStatus.SKIP,"tc skipped");
		report.endTest(test);
		report.flush();
		
	}

}
