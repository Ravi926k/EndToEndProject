package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	WebDriver driver;
	Properties prop;
	
	public WebDriver browser_initialization() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("F:\\A Java Selenium\\Real Project\\E2EProject\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browsername=prop.getProperty("Browser");
		System.out.println("Browsername"+"= "+browsername);
		
		
		return driver;
		
		
		
		
		
	}

}
