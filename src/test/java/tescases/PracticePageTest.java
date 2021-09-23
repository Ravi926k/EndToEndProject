package tescases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.LoginPageObjects;
import pageobjects.PracticePageObjects;
import resources.BaseClass;

public class PracticePageTest extends BaseClass {

	public WebDriver driver;
	public Properties prop;
	

	@BeforeTest
	public void LaunchbrowserLogin() throws IOException {

		driver = browser_initialization();
		driver.get("https://courses.rahulshettyacademy.com/");
		LoginPageTest lt = new LoginPageTest();

	}

	@Test
	public void performactioninPracticepage() throws InterruptedException {
		PracticePageObjects pp = new PracticePageObjects(driver);

		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.loginbtn();
		lp.getusername();
		lp.getpass();
		
		
		pp.practicelink();
		pp.selectAutomationPractice2();
		pp.selectRatiobtn();
		pp.suggestTextBox();

		pp.dropDownhandle();

	}

	@AfterTest
	public void teardoen() {

		driver.close();
	}

}
