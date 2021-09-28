package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

	WebDriver driver;
	Properties prop;
	PageFactory page;

	public WebDriver browser_initialization() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Ravi\\eclipse-workspace\\EndToEndProject\\src\\main\\java\\resources\\dataset.properties");

		prop.load(fis);
		String browsername = prop.getProperty("Browser");
		System.out.println("Browsername" + "= " + browsername);

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"F:\\A Java Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browsername.equals("firefox")) {

			System.setProperty("webdriver.chrome.driverr",
					"F:\\A Java Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("IE")) {

			System.setProperty("webdriver.chrome.driver",
					"F:\\A Java Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);

		return driver;

	}

	public String getscreenshot(String testcasename,WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyDirectory(source,new File(destination));

		return destination;

	}

}
