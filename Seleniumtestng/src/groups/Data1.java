package groups;

import org.testng.annotations.Test;
@Test(groups= {"smoke"})

public class Data1 {
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("india");
	}
	@Test(groups= {"sanity","regression"})
	public void test2() 
	{
		System.out.println("Asia");
	}
	@Test(groups= {"regression"})
	public void test3() 
	{
		System.out.println("bengaluru");
	}

}
