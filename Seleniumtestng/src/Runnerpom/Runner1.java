package Runnerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Login;

public class Runner1 {
@Test
public void log() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
	Thread.sleep(2000);
	Login l=new Login(driver);
	l.click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	l.click();
	
	
}
}
