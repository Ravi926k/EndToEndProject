package pageobjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.BaseClass;

public class LoginPageObjects extends BaseClass {

	public WebDriver driver;
	public Properties prop;

	@FindBy(xpath = "//a[@class='theme-btn']")
	WebElement loginbutton;

	@FindBy(xpath = "//input[@type='email']")

	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-md login-button']")
	WebElement submit;

	public LoginPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement loginbutton() {
		loginbutton.click();
		email.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("pass"));
		submit.click();
		return loginbutton;
	}

}
