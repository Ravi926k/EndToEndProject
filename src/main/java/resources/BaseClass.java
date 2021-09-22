package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	Properties prop;
	
	public WebDriver browser_initialization() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("F:\\A Java Selenium\\Real Project\\E2EProject\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browsername=prop.getProperty("Browser");
		System.out.println("Browsername"+"= "+browsername);
		
		if(browsername.equals("Chrome")) {
			
			System.setProperty("WebDriver.chrome.driver", "F:\\A Java Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		} else if(browsername.equals("firefox")) {
			
			System.setProperty("WebDriver.chrome.driver", "F:\\A Java Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		} else if(browsername.equals("IE")) {
			
			System.setProperty("WebDriver.chrome.driver", "F:\\A Java Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
		
		
		
	}

}
