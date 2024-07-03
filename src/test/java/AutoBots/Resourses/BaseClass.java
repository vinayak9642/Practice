package AutoBots.Resourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AutoBots.BuildFramwork.ValidationTest;
import AutoBots.PomClasses.LoginPage;

public class BaseClass {
	
	
	public WebDriver driver;
	
	
	public WebDriver BrowserInvoke() throws IOException {
		
		Properties pro = new Properties() ;
		FileInputStream fis = new FileInputStream("C:\\Users\\vinay\\eclipse-workspace\\AutoBots\\src\\main\\java\\AutoBots\\GlobalInfo\\GlobalParameters.properties");
		
		pro.load(fis);
		String browser = pro.getProperty("browser");
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			
			driver = new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		} driver.manage().window().maximize();
		
		return driver;
		
	}
	@BeforeMethod(alwaysRun = true)
	public void getlogin() throws IOException {
		
		driver = BrowserInvoke();
		LoginPage lp = new LoginPage(driver);
		lp.gotourl();
		
	}
	@AfterMethod(alwaysRun = true)
	public void tierdown() {
		driver.close();
		
		
	}


	public String ScreenShot (WebDriver driver,String scname1) throws IOException {
		TakesScreenshot screen = ((TakesScreenshot)driver);
		File srcfile = screen.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir")+ "//reports//myreport"+scname1 +".png");
		FileUtils.copyFile(srcfile, destfile);
		
		return System.getProperty("user.dir")+ "//reports"+scname1 +".png";
	}



}


