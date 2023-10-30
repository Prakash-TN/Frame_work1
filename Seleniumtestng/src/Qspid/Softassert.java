package Qspid;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert extends Facebookgeneric {
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("8017208193");
		driver.findElement(By.id("pass")).sendKeys("selenium1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String tit = driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(tit, "(20+)Facebook");
		System.out.println("music");
		sa.assertAll();
		
	}

}
