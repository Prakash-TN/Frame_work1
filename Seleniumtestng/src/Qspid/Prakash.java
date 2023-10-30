package Qspid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prakash {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	     driver.findElement(By.id("email")).sendKeys("hiii");
	     driver.findElement(By.id("pass")).sendKeys("mixicc");
	     WebElement ele = driver.findElement(By.name("login"));
	     WebDriverWait wait=new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.visibilityOf(ele)).click();
		Reporter.log("mizicc",true);
	}
	

}
