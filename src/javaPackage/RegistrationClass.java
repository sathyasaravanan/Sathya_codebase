package javaPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class RegistrationClass extends ExcelData{
public static WebDriver drv1;
public RegistrationClass(WebDriver driver)
{
	drv1=driver;
PageFactory.initElements(driver, this);
}


@FindBy(xpath="//*[@id='loginPanel']//a[text()='Register']")
public WebElement lnkRegister;
@FindBy(id="customer.firstName")
public WebElement txtFirstName;
@FindBy(id="customer.lastName")
public WebElement txtLastName;
@FindBy(id="customer.address.street")
public WebElement txtAddress;
@FindBy(id="customer.address.city")
public WebElement txtCity;
@FindBy(id="customer.address.state")
public WebElement txtState;
@FindBy(id="customer.address.zipCode")
public WebElement txtZipcode;
@FindBy(id="customer.phoneNumber")
public WebElement txtPhoneNumber;
@FindBy(id="customer.ssn")
public WebElement txtSsn;
@FindBy(id="customer.username")
public WebElement txtUsername;
@FindBy(id="customer.password")
public WebElement txtPassword;
@FindBy(id="repeatedPassword")
public WebElement txtConfrmPassword;
@FindBy(xpath="//*[@id='customerForm']//input[@value='Register']")
public WebElement btnregister;
@FindBy(xpath="//*[@id='rightPanel']/h1")
public WebElement txtmessage;
@FindBy(xpath="//*[@id='rightPanel']/p")
public WebElement txtmessage2;
@FindBy(xpath="//a[contains(text(),'Log Out')]")
public WebElement btnlogout;



String firstname = datamap.get("FirstName"); 
String lastname = datamap.get("LastName");
String address = datamap.get("Address");
String city = datamap.get("City");
String state = datamap.get("State");
String zipcode = datamap.get("Zipcode");
String phonenum = datamap.get("PhoneNum");
String ssn = datamap.get("SSN");
String username = datamap.get("Username");
String password = datamap.get("Password");
String confpassword = datamap.get("ConfrmPassword");


public void clickRegistration() {
	this.lnkRegister.click();
	
}
public void LaunchApplication(String url) {
	drv1.get(url);
}


public void registrationDetails() throws InterruptedException {
	
	
	this.txtFirstName.sendKeys(firstname);
	this.txtLastName.sendKeys(lastname);
	this.txtAddress.sendKeys(address);
	this.txtCity.sendKeys(city);
	this.txtState.sendKeys(state);
	this.txtPhoneNumber.sendKeys(phonenum);
	this.txtZipcode.sendKeys(zipcode);
	this.txtSsn.sendKeys(ssn);
	this.txtUsername.sendKeys(username);
	this.txtPassword.sendKeys(password);
	this.txtConfrmPassword.sendKeys(confpassword);
	//this.btnregister.click();
	System.out.println(txtmessage.getText());
	System.out.println(txtmessage2.getText());
	//this.btnlogout.click();
	Thread.sleep(5000);
	
	
	
}




}
