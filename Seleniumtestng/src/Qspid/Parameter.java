package Qspid;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parameter {
@Test(priority=1)
public void test1()
{
	Reporter.log("hello",true);
}
@Test
public void test2()
{
	Reporter.log("wolrd",true);
}
}
