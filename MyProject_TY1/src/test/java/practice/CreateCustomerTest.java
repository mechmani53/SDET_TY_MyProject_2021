package practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;


public class CreateCustomerTest 
{
	@Test
	public void createCustomerTest(XmlTest xml)
	{
		System.out.println("execute 1");
		String BROWSER=xml.getParameter("browser");
		System.out.println(BROWSER);
		
	}

}