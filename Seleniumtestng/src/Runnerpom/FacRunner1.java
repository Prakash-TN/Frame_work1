package Runnerpom;

import org.testng.annotations.Test;

import Genericcode.Facebookgeneric;
import POMscript.Facebk;

public class FacRunner1 extends Facebookgeneric {
	@Test
	public void login() throws InterruptedException
	{
		Facebk f1=new Facebk(driver);
		f1.unpass("");
		f1.pwdpass("");
		f1.logbtn();
		Thread.sleep(4000);
	}

}
