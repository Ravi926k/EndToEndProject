package pageobjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class LoginPageObjects extends BaseClass {

	public WebDriver driver;
	public Properties prop;

	@FindBy(xpath = "//a[@class='theme-btn']")
	private WebElement loginbutton;

	@FindBy(xpath = "//input[@type='email']")

	private WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-md login-button']")
	private WebElement submit;

	public LoginPageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginbtn() {
		loginbutton.click();

	}

	public void getusername() {

		email.sendKeys("ravismart926@gmail.com");

	}

	public void getpass() {

		password.sendKeys("ravismart926");

	}

	public void getsubmit() {

		submit.click();

	}

}
