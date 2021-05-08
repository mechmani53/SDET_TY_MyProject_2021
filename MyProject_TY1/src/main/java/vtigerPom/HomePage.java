package vtigerPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtils.WebDriverUtility;
import vtigerPomLeadModule.LeadPage;



public class HomePage extends WebDriverUtility
{
	
	public WebDriver driver;

	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(linkText="Leads")
	private WebElement leadLink;
	

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstratorIMG;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;
	

	public WebElement getLeadLink() {
		return leadLink;
	}

	public WebElement getAdminstratorIMG() 
	{
		return adminstratorIMG;
	}

	public WebElement getSignOutLink() 
	{
		return signOutLink;
	}
	
	public LeadPage clickOnLeadLink()
	{
	
		leadLink.click();
		return new LeadPage(driver);
	}

	
	public void signOut() {
		mouseHover(driver, adminstratorIMG);
		signOutLink.click();
	}
}