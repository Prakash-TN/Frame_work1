package Runnerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Facelog;

public class Runnerf2 {
	@Test
	public void flogin()
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Facelog f = new Facelog(driver);
		f.utext("praki6363@gmail.com");
		f.upass("833y34");
		driver.navigate().refresh();
		f.utext("praki6363@gmail.com");
		f.btnclick();
	}

}
