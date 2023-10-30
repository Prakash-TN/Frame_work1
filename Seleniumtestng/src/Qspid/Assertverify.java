package Qspid;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertverify extends Facebookgeneric {
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("8017208193");
		driver.findElement(By.id("pass")).sendKeys("selenium1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String tit = driver.getTitle();
		Assert.assertEquals(tit, "(20+) Facebook");
		System.out.println("heyy");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("8017208193");
		driver.findElement(By.id("pass")).sendKeys("selenium1234");
		driver.findElement(By.name("login")).click();
		
	}

}
