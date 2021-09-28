package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PracticePageObjects {

	public WebDriver driver;
	

	@FindBy(xpath = "//div[@class='nav-outer clearfix']//a[normalize-space()='Practice']")
	private WebElement practicebtn;

	@FindBy(xpath = "//a[normalize-space()='Automation Practise - 2']")
	private WebElement automationparactice2;

	@FindBy(css = "//label[normalize-space()='Radio2']")
	private WebElement radiobutton2;

	@FindBy(id = "autocomplete")
	private WebElement suggeestbox;

	@FindBy(css = "select[id='dropdown-class-example']")
	private WebElement dropdown;
	
	@FindBy (xpath = "//input[@id='name']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath = "//button[@id='form-submit']")
	private WebElement submit;
	
	@FindBy (xpath = "//input[@id='agreeTerms']")
	private WebElement agree;
	
	
	
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
	public void usernametext() {

		username.sendKeys("ravichandran");

	}
	public void emailtext() {

		email.sendKeys("ravismart926@gmail.com");

	}
	public void clicksubmit() {

		submit.click();

	}
	
	
	
	public void agreebox() {

		agree.click();

	}
	
	public void popuphandle() {
		
		if (username.isDisplayed()) {
		usernametext();
		emailtext();
		agreebox();
		clicksubmit();
		}
		else {
			
			System.out.println("No popup displayed ");
		}
	}
	
	

	public void suggestTextBox() throws InterruptedException {

		suggeestbox.sendKeys("Ame");
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	}

	public void dropDownhandle() {

		Select drop = new Select(dropdown);

		drop.selectByIndex(2);

	}
	
	
	
	
}
