package POMscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebk {
	@FindBy(id="email")
	private WebElement untxt;
	@FindBy(id="pass")
	private WebElement pwdtext;
	@FindBy(name="login")
	private WebElement lgnbtn;
	public Facebk(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void unpass(String un)
	{
		untxt.sendKeys(un);
	}
	public void pwdpass(String pwd)
	{
		pwdtext.sendKeys(pwd);
	}
	public void logbtn()
	{
		lgnbtn.click();
	}

}
