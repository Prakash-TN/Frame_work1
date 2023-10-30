package Qspid;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runnerclass1 extends Facebookgeneric
{
	@Test
	public void login()
	{
	driver.findElement(By.id("email")).sendKeys("8017208193");
	driver.findElement(By.id("pass")).sendKeys("selenium1234");
	driver.findElement(By.name("login")).click();
	String tit = driver.getTitle();
	System.out.println(tit);
	}
	@Test
	public void search()
	{
		driver.findElement(By.id("email")).sendKeys("8017208193");
		driver.findElement(By.id("pass")).sendKeys("selenium1234");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("PrakashPrakash");
	}

}
