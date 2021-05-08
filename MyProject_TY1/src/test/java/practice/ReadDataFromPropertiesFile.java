package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertiesFile 
{
	@Test
	public void readDataTest() throws Throwable 
	{
		/*read data from properties file*/
		//step-1 get the java representation object of the physical file
		FileInputStream file=new FileInputStream("C:\\Users\\Mani\\Desktop\\commonData.properties");
		//step-2 create an object of the properties class & load the all key :value pair
		Properties pObj=new Properties();
		pObj.load(file);
		//strp-3 read the value using getProperty("")
		String URL=pObj.getProperty("url");
		String BROWSER=pObj.getProperty("browser");
		String USER=pObj.getProperty("username");
		String PASSWORD=pObj.getProperty("password");
		String TIME=pObj.getProperty("timeout");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USER);
		System.out.println(PASSWORD);
		System.out.println(TIME);
	}		
		
	}
