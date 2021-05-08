package vtigerPomLeadModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtils.WebDriverUtility;

public class ConvertLeadPage extends WebDriverUtility
{
	WebDriver driver;
	public ConvertLeadPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "select_potential")
	private WebElement opportunityCheckboxLink;

	@FindBy(id = "select_account")
	private WebElement accountCheckboxLink;
	
	@FindBy(id = "select_contact")
	private WebElement contactCheckboxLink;
	
	@FindBy(id = "jscal_field_closedate")
	private WebElement dateTF;

	
	@FindBy(name = "lastname")
	private WebElement lastNameTF;
	
	@FindBy(name = "amount")
	private WebElement amountTF;
	
	public WebElement getOpportunityCheckboxLink()
	{
		return opportunityCheckboxLink;
	}
	public WebElement getAccountCheckboxLink()
	{
		return accountCheckboxLink;
	}

	public WebElement getContactCheckboxLink()
	{
		return contactCheckboxLink;
	}
	public WebElement getAmountTF() 
	{
		return amountTF;
	}

	@FindBy(name = "Save")
	private WebElement savebtn;
	
	
	public WebElement getDateTF()
	{
		return dateTF;
	}

	public WebElement getLastNameTF()
	{
		return lastNameTF;
	}

	public WebElement getSavebtn()
	{
		return savebtn;
	}

	
	public void convertLeadInvalidDate(String date,String amount)
	{
		opportunityCheckboxLink.click();
		dateTF.sendKeys(date);
		amountTF.sendKeys(amount);
		//savebtn.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",savebtn);	
		acceptAlert(driver);
	}
	public void convertLeadInvalidAmount(String date,String amount)
	{
		opportunityCheckboxLink.click();
		dateTF.sendKeys(date);
		amountTF.sendKeys(amount);
		//savebtn.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",savebtn);
		acceptAlert(driver);
	}
	public void convertLeadValidAmount(String date,String amount)
	{
		opportunityCheckboxLink.click();
		dateTF.sendKeys(date);
		amountTF.sendKeys(amount);
		//savebtn.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",savebtn);
	}
	
		public void convertLeadEmpty()
	{
		opportunityCheckboxLink.click();
		//savebtn.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",savebtn);	
		acceptAlert(driver);
	}
	public void convertLeadEmptyCheckBox()
	{
		accountCheckboxLink.click();
		contactCheckboxLink.click();
		//savebtn.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",savebtn);
		acceptAlert(driver);
	}
}

