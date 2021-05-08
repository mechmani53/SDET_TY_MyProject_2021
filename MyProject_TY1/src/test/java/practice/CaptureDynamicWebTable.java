package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureDynamicWebTable 
{
@Test
public void CaptureOrgName()
{

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	//Step1: get URL
	driver.get("http://localhost:8888/");
	
	//Step2:Login to appln
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	
	//Step3:Navigate to Organization
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Organizations")).click();
	
	//Step4: Capture all the Organization names
	
	String x="//table[@class='lvt small']/tbody/tr[*]/td[1]/input";
	List<WebElement> list=driver.findElements(By.xpath(x));
	
	for(int i=1;i<list.size();i++)
	{
		list.get(i).click();
	}
}

}
