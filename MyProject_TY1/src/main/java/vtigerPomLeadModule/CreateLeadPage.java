package vtigerPomLeadModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateLeadPage
{
	WebDriver driver;
	public CreateLeadPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(name = "firstname")
	private WebElement firstNameTF;

	@FindBy(name = "lastname")
	private WebElement lasttNameTF;
	
	@FindBy(name = "company")
	private WebElement companyNameTF;
	
	@FindBy(name = "salutationtype")
	private WebElement leadSalutationTF;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	
	@FindBy(linkText = "Convert Lead")
	private WebElement convertLeadLink;
	
	public WebElement getFirstNameTF() 
	{
		return firstNameTF;
	}


	public WebElement getLasttNameTF() 
	{
		return lasttNameTF;
	}


	public WebElement getCompanyNameTF() 
	{
		return companyNameTF;
	}


	public WebElement getLeadSalutationTF() 
	{
		return leadSalutationTF;
	}


	public WebElement getSaveBtn() 
	{
		return saveBtn;
	}


	public WebElement getConvertLeadLink()
	{
		return convertLeadLink;
	}

	public ConvertLeadPage createLead(String firstName,String lastName,String companyName,String leadSalutation ) 
	{
		firstNameTF.sendKeys(firstName);
		lasttNameTF.sendKeys(lastName);
		companyNameTF.sendKeys(companyName);
		leadSalutationTF.sendKeys(leadSalutation);
		saveBtn.click();
		convertLeadLink.click();
		return new ConvertLeadPage(driver);
	}
	}
