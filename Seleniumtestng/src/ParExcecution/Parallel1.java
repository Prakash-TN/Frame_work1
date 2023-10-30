package ParExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel1 {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void test(String browser)
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
		}
		else
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
		
		
	}

}
