package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='theme-btn']")
	WebElement loginbutton;

	@FindBy(xpath = "//input[@type='email']")

	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-md login-button']")
	WebElement submit;

	
	public LoginPageObjects(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
}




