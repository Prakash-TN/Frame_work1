package Qspid;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency {
@Test
public void compose()
{
	Reporter.log("compose",true);
}
@Test(dependsOnMethods ="compose" )
public void senitems()
{
	Reporter.log("sent items",true);
	Assert.fail();
}
@Test (dependsOnMethods = "senitems")
public void trash()
{
	Reporter.log("trash",true);
}
}
