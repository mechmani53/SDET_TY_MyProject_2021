package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureDynamicWebTable4
{
	@Test
public void CaptureOrgName() throws Throwable
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
	
	String expData="mani";
	int actRowCount=0;
	//Step4: Capture all the Organization names
	Thread.sleep(5000);
		String x="//table[@class='lvt small']/tbody/tr[*]/td[3]/a";
	List<WebElement> list=driver.findElements(By.xpath(x));
	
	for(WebElement wb:list)
	{
		String actData=wb.getText();
		if(expData.equals(actData))
		{
			wb.click();
			break;
		}
		
	}
	driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+actRowCount+"]/td[8]/a[.='del']")).click();
	
	
}

}
