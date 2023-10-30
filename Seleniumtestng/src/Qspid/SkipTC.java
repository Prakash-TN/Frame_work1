package Qspid;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTC {
@Test(enabled=false)
public void test1()
{
	Reporter.log("Hyderbad",true);
}
@Test
public void test()
{
	Reporter.log("America",true);
}
}
