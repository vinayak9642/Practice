package AutoBots.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage {


WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (xpath = "//a[text()='GreenKart']") 
	WebElement Button;		
	
	@FindBy (xpath= "//h1[text()='CGT']")
	WebElement logo;
	
	@FindBy (xpath="//div/p")
	WebElement title;
	
	@FindBy (xpath = "//div/h1[text()='WELCOME TO JAVA SELENIUM COURSE ']")
	WebElement welcome;
	
	@FindBy (xpath = "//a[text()='Home']")
	WebElement home;
	

 	public String UrlValidationOfHome() {
		
		String Homeurl = driver.getCurrentUrl();
		return Homeurl;
		
	} 

	public String logoValidation() {
		
		String Cgt = logo.getText();
		return Cgt;
		
	}
	//todo
	
 public String TitleValidation() {
		
		String titles = title.getText();
		return titles;
	
		// Assert.assertEquals(titles, "I'AM ANURAG");
		
	}
 
 public String ValidationOfHomeButtonText() {
		
		String txt = home.getText();
		return txt;
		
 }

	
 public String WelcomeValidation() {
		
		String header2 = welcome.getText();
		return header2;
		
	}
 
 public String ValidationOfGreenKartTextButtons() {
		
		String text = Button.getText();
		return text;
		
	}
 
	public void GreenKartButton() {
		Button.click();
		
		
	}

}

