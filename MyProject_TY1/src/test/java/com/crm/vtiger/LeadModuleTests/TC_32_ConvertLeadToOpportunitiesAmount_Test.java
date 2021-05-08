package com.crm.vtiger.LeadModuleTests;

import org.testng.annotations.Test;

import genericUtils.BaseClass;
import vtigerPomLeadModule.ConvertLeadPage;
import vtigerPomLeadModule.CreateLeadPage;
import vtigerPomLeadModule.LeadPage;




//@Listeners(vtiger.automation.ListImgClass.class)
public class TC_32_ConvertLeadToOpportunitiesAmount_Test extends BaseClass
{
	
		@Test(groups = "smokeTest")
		public void convertLeadToOpportunity() throws Throwable
		{
						
		String firstName=eUtil.getExcelSheet("Sheet2", 1, 2)+"_"+jUtil.getRandomData();
		String lastName=eUtil.getExcelSheet("Sheet2", 3, 2)+"_"+jUtil.getRandomData();
		String companyName=eUtil.getExcelSheet("Sheet2", 5, 2)+"_"+jUtil.getRandomData();
		String leadSalutation=fUtil.getDataFromJson("salutation");
		String date=fUtil.getDataFromJson("date");
		String amount=fUtil.getDataFromJson("amount");
		
		//wUtil.sleep(2000);
		
		//Navigate to leadPage
		LeadPage leadPage=homePage.clickOnLeadLink();
						
		//click on lead link
		CreateLeadPage createLeadPage = leadPage.clickOnCreateLeadIMG();
		
		//click on createlead
		ConvertLeadPage convertLeadPage = createLeadPage.createLead(firstName, lastName, companyName, leadSalutation);
		
		//click on convertlead
		convertLeadPage.convertLeadValidAmount(date, amount);
		
		
		
		/*driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		WebElement salutation = driver.findElement(By.name("salutationtype"));
		wUtil.selectOption(salutation, fUtil.getDataFromJson("salutation"));
		driver.findElement(By.name("firstname")).sendKeys(firstName + javaUtility.getRandomData());
		driver.findElement(By.name("lastname")).sendKeys(lastName + javaUtility.getRandomData());
		driver.findElement(By.name("company")).sendKeys(companyName +javaUtility.getRandomData());
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	//Convert to Lead
		driver.findElement(By.linkText("Convert Lead")).click();

	//providing data in Convert Lead page
		
		driver.findElement(By.id("select_potential")).click();
		driver.findElement(By.id("jscal_field_closedate")).sendKeys(fUtil.getDataFromJson("date"));
		driver.findElement(By.name("lastname")).sendKeys(javaUtility.getRandomData());
		driver.findElement(By.name("amount")).sendKeys(fUtil.getDataFromJson("invalidamount"));
		//driver.findElement(By.name("Save")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",driver.findElement(By.name("Save")));
		wUtil.acceptAlert(driver);*/
}
	}
