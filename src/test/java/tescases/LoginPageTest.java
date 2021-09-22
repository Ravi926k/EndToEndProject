package tescases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.LoginPageObjects;
import resources.BaseClass;

public class LoginPageTest extends BaseClass {

	public WebDriver driver;
	public Properties prop;

	@BeforeTest
	public void LaunchbrowserLogin() throws IOException {

		driver = browser_initialization();
		driver.get("https://courses.rahulshettyacademy.com/");

	}

	@Test
	public void loginToApplication() {

		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.loginbtn();
		lp.getusername();
		lp.getpass();
		lp.getsubmit();

	}

	@AfterTest
	public void teardoen() {

		driver.close();
	}

}
