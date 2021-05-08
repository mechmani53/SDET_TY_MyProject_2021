package vtigerPomLeadModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage 
{
	WebDriver driver;
	public LeadPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createLeadIMG;

	public WebElement getCreateContactIMG() {
		return createLeadIMG;
	}
	
	/**
	 * click on create lead image
	 */
	public CreateLeadPage clickOnCreateLeadIMG() 
	{
		createLeadIMG.click();
		return new CreateLeadPage(driver);
	}
}