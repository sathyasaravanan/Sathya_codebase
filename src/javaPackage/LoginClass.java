package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass extends ExcelData {

	// private static WebDriver drv1=null;
	public LoginClass(WebDriver driver) {
		// drv1=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='loginPanel']//input[@name='username']")
	public WebElement txtloginuser;
	@FindBy(xpath = "//*[@id='loginPanel']//input[@name='password']")
	public WebElement txtloginpwd;
	@FindBy(xpath = "//*[@id='loginPanel']//input[@value='Log In']")
	public WebElement btnLogin;
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	public WebElement btnlogout;

	String username = datamap.get("Username");
	String password = datamap.get("Password");

	public void clickLogin() throws InterruptedException {
		this.txtloginuser.sendKeys(username);
		this.txtloginpwd.sendKeys(password);
		Thread.sleep(5000);
		//this.btnLogin.click();
		//this.btnlogout.click();

	}

}
