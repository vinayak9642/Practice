package AutoBots.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage {

	WebDriver driver;
	
	public  ValidationPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy (xpath = "//h1[text()='Sign in']")
	WebElement SignInText ;
	
	@FindBy(xpath= "//label[text()=' Remember my username']")
	WebElement RememberUser ;
	
	@FindBy (xpath="//label[@for='chkboxTwo']")
	WebElement TearmsAndPolicy ;
	
	@FindBy(xpath= "//h1[text()='CGT Academy']")
	WebElement header;
	
	@FindBy (xpath="//a[text()='Forgot your password?']")
	WebElement forgotpass;
	
	@FindBy (xpath="//p[text()='An Academy to Learn Earn & Shine in your QA Career']")
	WebElement Quote;
	
	@FindBy (xpath = "//a[text()='Forgot your password?']")
	WebElement ForgotText ;
	
	
		
	
	
	public String SiginV() {
		
	String sigin = 	SignInText.getText();
		
		return sigin;
	}
	
	public String RememberV() {
		
		String head = RememberUser.getText();
		return head;
		
	}
	
	public String TearmsAndPolicyValidation() {
		
		String TandP = TearmsAndPolicy.getText();
		return TandP;
		
	}
	
public String HeaderTitle() {
		
		String Head = header.getText();
		return Head;
		
	}
public String ForgotPassword() {
	
	String fp = forgotpass.getText();
	return fp;
	
}
	
public String Subtitle() {
String Motivation =	Quote.getText();
	return Motivation;
}

public String ForgotPasswordText() {
	String FP = ForgotText.getText();
	
	return FP;
}

}
