package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Youtube {
	@FindBy(xpath="//input[@id='search']")
	private WebElement seatxt;
	@FindBy(id="search-icon-legacy")
	private WebElement seabtn;
	@FindBy(xpath="//a[@id='video-title']")
	private WebElement vidclick;
	public Youtube(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void text(String enter)
	{
		seatxt.sendKeys(enter);
	}
	public void btn()
	{
		seabtn.click();
	}
	public void videclick()
	{
		vidclick.click();
	}

}
