package AutoBots.Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	

	WebDriver driver;
	
	public AbstractComponents (WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
public void scrolldown(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
	}

public void alerts(WebDriver driver) {

	driver.switchTo().alert().accept();
	
	}

public void waits(By path) {
	
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(path));
	
	}


}
