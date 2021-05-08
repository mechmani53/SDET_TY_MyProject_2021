package com.crm.vtiger.LeadModuleTests;


import org.testng.annotations.Test;

import genericUtils.BaseClass;
import vtigerPomLeadModule.ConvertLeadPage;
import vtigerPomLeadModule.CreateLeadPage;
import vtigerPomLeadModule.LeadPage;


//@Listeners(vtiger.automation.ListImgClass.class)
public class TC_35_ConvertLeadToOpportunitiesCheckboxUnSelect_Test extends BaseClass
{
	@Test(groups = "regressionTest")
	public void convertLeadToOpportunity() throws Throwable
	{

		String firstName=eUtil.getExcelSheet("Sheet2", 1, 2)+"_"+jUtil.getRandomData();
		String lastName=eUtil.getExcelSheet("Sheet2", 3, 2)+"_"+jUtil.getRandomData();
		String companyName=eUtil.getExcelSheet("Sheet2", 5, 2)+"_"+jUtil.getRandomData();
		String leadSalutation=fUtil.getDataFromJson("salutation");
		
		
		//wUtil.sleep(2000);
		
		//Navigate to leadPage
		LeadPage leadPage=homePage.clickOnLeadLink();
						
		//click on lead link
		CreateLeadPage createLeadPage = leadPage.clickOnCreateLeadIMG();
		
		//click on createlead
		ConvertLeadPage convertLeadPage = createLeadPage.createLead(firstName, lastName, companyName, leadSalutation);
		
		//click on convertlead
		convertLeadPage.convertLeadEmptyCheckBox();
	
		

			/*driver.findElement(By.linkText("Convert Lead")).click();

	//providing data in Convert Lead page
			
			driver.findElement(By.id("select_account")).click();
			//driver.findElement(By.id("select_potential")).click();
			//driver.findElement(By.id("jscal_field_closedate")).sendKeys("2021-04-30");
			//driver.findElement(By.name("lastname")).sendKeys(javaUtility.getRandomData());
			//driver.findElement(By.name("amount")).sendKeys("5000");
			driver.findElement(By.id("select_contact")).click();
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();",driver.findElement(By.name("Save")));
			//driver.findElement(By.name("Save")).click();
			webUtil.acceptAlert(driver);*/
	
}
}