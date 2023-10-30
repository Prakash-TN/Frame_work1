package Genericcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Facebookgeneric 
{
	public WebDriver driver;
@BeforeMethod
public void openApln()
{
	System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.Facebook.com");
}
@AfterMethod
public void closeAppln()
{
	driver.close();
}

}
