package practice;

import org.testng.annotations.Test;

public class CreateCustomer1Test
{

	@Test
	public void createCustomer1Test()
	{
		System.out.println("Data from maven command ");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
