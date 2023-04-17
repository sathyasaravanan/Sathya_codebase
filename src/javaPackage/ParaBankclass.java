package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ParaBankclass {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		ExcelData excl = new ExcelData();
		excl.getExcelConnection();
		excl.queryData("Data", "TC_1");
		excl.queryData("Register", "TC_01");
		

		
		  Config conf=new Config(); String appUrl=Config.getAppurl("parabank");
		  
		  System.out.println("URL from config"+ appUrl); String
		  appUrl2=Config.getAppurl("google");
		  
		  System.out.println("URL from config"+ appUrl2);
		 

		RegistrationClass regcls = new RegistrationClass(driver);
		// LoginClass logincls=new LoginClass(driver);
		// ForgotLogininfo forgotlogin=new ForgotLogininfo(driver);
		regcls.LaunchApplication("https://parabank.parasoft.com/parabank/index.htm");
		regcls.clickRegistration();
		regcls.registrationDetails();
		// logincls.clickLogin();
		// forgotlogin.clickForgotlogin();
		// forgotlogin.Forgotlogin();

	}

}
