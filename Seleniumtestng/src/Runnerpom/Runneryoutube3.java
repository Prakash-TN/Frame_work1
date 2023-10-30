package Runnerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Youtube;

public class Runneryoutube3 {
@Test
public void playvideo() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(3000);
	Youtube y=new Youtube(driver);
	y.text("jailer trailer");
	Thread.sleep(2000);
	y.btn();
	Thread.sleep(2000);
	y.videclick();
}
}
