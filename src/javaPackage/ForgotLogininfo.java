package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotLogininfo {
    private static WebDriver drv1;
    public ForgotLogininfo(WebDriver driver) {
		drv1=driver;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//*[@id=\"loginPanel\"]//a[contains(text(),'Forgot login info?')]")
	public WebElement btnforgotlogin;
	@FindBy(xpath="//*[@id='firstName']")
	public WebElement txtuserFname;
	@FindBy(xpath="//*[@id='lastName']")
	public WebElement txtuserLname;
	@FindBy(xpath="//*[@id='address.street']")
	public WebElement txtuserAdd;
	@FindBy(xpath="//*[@id='address.city']")
	public WebElement txtuserCity;
	@FindBy(xpath="//*[@id='address.state']")
	public WebElement txtuserState;
	@FindBy(xpath="//*[@id='address.zipCode']")
	public WebElement txtuserZip;
	@FindBy(xpath="//*[@id='ssn']")
	public WebElement txtuserssn;
    @FindBy(xpath="//*[@id=\"lookupForm\"]//input[@value='Find My Login Info']")
    public WebElement btnFindMyLogin;
    
public void clickForgotlogin() {
	
	this.btnforgotlogin.click();
}

public void Forgotlogin() {
	this.txtuserFname.sendKeys("Sathya");
	this.txtuserLname.sendKeys("Saro");
	this.txtuserAdd.sendKeys("Sweetberry");
	this.txtuserCity.sendKeys("Alpharetta");
	this.txtuserState.sendKeys("GA");
	this.txtuserZip.sendKeys("30005");
	this.txtuserssn.sendKeys("12345");
	this.btnFindMyLogin.click();
	
	
	
	
}
	
	
	
}
