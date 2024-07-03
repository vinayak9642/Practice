package AutoBots.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {

	 WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
		this.driver = driver;
         PageFactory.initElements(driver, this);
	 	
	 }  
	
	@FindBy (xpath = "//h1[text()='Sign in']")
	WebElement SignInText ;
	
	@FindBy(xpath = "//input[@id='inputUsername']")
	WebElement UserId;
	
	@FindBy(xpath= "//label[text()=' Remember my username']")
	WebElement RememberUser ;
	
	@FindBy (xpath="//label[@for='chkboxTwo']")
	WebElement TearmsAndPolicy ;
	
	
	@FindBy (xpath="//input[@placeholder='cgtacademy']")
	WebElement UserName;
	
	@FindBy (xpath="//input[@placeholder='cgt@123']")
	WebElement Password;
	
	//pending  
	@FindBy (xpath = "//input[@type='checkbox']")
	WebElement Check1;
	
	@FindBy (xpath = "(//input[@type='checkbox'])[2]")
	WebElement Check2;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement SiginButton;
	
	@FindBy (xpath = "//div[@class=\"forgot-pwd-container\"]")
	WebElement ForgotPass;
	

	@FindBy (xpath = "//input[@placeholder=\"Name\"]")
	WebElement feild1InFP;
	
	@FindBy (xpath = "//input[@placeholder=\"Email\"]")
	WebElement feild2InFP;
	
	@FindBy (xpath = "//input[@placeholder=\"Phone Number\"]")
	WebElement feild3InFP;
	
	@FindBy (xpath = "//a[@class=\"go-to-login-btn\"]")
	WebElement gotoLogin;
	

	
	public void gotourl() {	
		
		driver.get("https://banavaths45.github.io/selinium/");
		
		
	}
	
	public void PageTitle() {
		
		String original = driver.getTitle();
		Assert.assertEquals(original, "React App");
		
	}

	public void UrlValidation() {
		
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "https://banavaths45.github.io/selinium/");
	
	}
	
	
	
	public void ValidLogin(String user ,String pass) {
		
		UserName.sendKeys(user);
		Password.sendKeys(pass);
		Check1.click();
		Check2.click();
		SiginButton.click();
		driver.switchTo().alert().accept();
		
	}

	
	public void InValidLogin(String user ,String pass) {
		
		UserName.sendKeys(user);
		Password.sendKeys(pass);
		Check1.click();
		Check2.click();
		SiginButton.click();
		driver.switchTo().alert().accept();
		
	}
	
	public void ForgotPassword() {
		
		ForgotPass.click();
		
	}
	public void  ForgotPasswordFields() {
		
		ForgotPass.click();
		feild1InFP.sendKeys("vinayak");
		feild2InFP.sendKeys("Karthik12@gmail.com");
		feild3InFP.sendKeys("9642370890");
		
		
	}
	
	public void GotoLoginButton() {
		
		ForgotPass.click();
		gotoLogin.click();
	}

	

	
	}

	

	
