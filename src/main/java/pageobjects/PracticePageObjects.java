package pageobjects;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PracticePageObjects {

	public WebDriver driver;
	public Properties prop;

	@FindBy(xpath = "(//a[@href='#/practice-project'])[1]")
	private WebElement practicebtn;

	@FindBy(xpath = "((//a[@href='https://rahulshettyacademy.com/AutomationPractice/'])[1]")
	private WebElement automationparactice2;

	@FindBy(css = "label[for='radio2']")
	private WebElement radiobutton2;

	@FindBy(id = "autocomplete")
	private WebElement suggeestbox;

	@FindBy(css = "select[id='dropdown-class-example']")
	private WebElement dropdown;

	public PracticePageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void practicelink() {

		practicebtn.click();

	}

	public void selectAutomationPractice2() {

		automationparactice2.click();

	}

	public void selectRatiobtn() {

		radiobutton2.click();

	}

	public void suggestTextBox() throws InterruptedException {

		suggeestbox.sendKeys("Ame");
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void dropDownhandle()  {

		Select drop=new Select(dropdown);
		
		drop.selectByIndex(2);
		
		
		
		
		
		
		
		
	}
}
