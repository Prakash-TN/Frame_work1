package Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property {
	@Test
	public void test() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./Data.properties"));
		String val = p.getProperty("baseurl");
		System.out.println(val);
	}
	
	

}

