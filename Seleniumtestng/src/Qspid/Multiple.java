package Qspid;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple {
@Test(invocationCount = 5,priority=1)
public void test1()
{
	Reporter.log("Prakash",true);
}
@Test
public void test2()
{
	Reporter.log("Vishal",true);
}
}
