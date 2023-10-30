package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy(id="login-signin")
private WebElement nxtbtn;
public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void click()
{
	nxtbtn.click();
}
}
