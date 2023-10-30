package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facelog {
	@FindBy(id="email")
	private WebElement usertext;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement btn;
	public Facelog(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void utext(String un)
	{
		usertext.sendKeys(un);
	}
	public void upass(String psw)
	{
		pass.sendKeys(psw);
	}
	public void btnclick()
	{
		btn.click();
		
	}

}
