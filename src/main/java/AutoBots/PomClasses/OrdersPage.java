package AutoBots.PomClasses;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrdersPage {


WebDriver driver;
	public  OrdersPage(WebDriver driver) {
	
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	 
	
   @FindBy (xpath="//h1[text()='My Orders']")
   WebElement heading;	

   @FindBy (xpath="//a[text()='GOTO GreenCart']")
   WebElement ButtonText;
   
   @FindBy (xpath="//tbody//td[2]")
   List<WebElement> table;
   

   

public List<String> ItemOfOrderValidation() {
   List<String> mylist = new ArrayList();
   for(WebElement getit : table) {
	   String list = getit.getText();
	   mylist.add(list);
	   
   }
   return mylist;
}
   
   

   public String UrlValidationOfOrder() {
		
		String Orderurl = driver.getCurrentUrl();
		return Orderurl;
		
	}
   
 
   public String ValidationOfHeaderText() {
	   
	  String header =  heading.getText();
	  
	  return header;
   }
	
	
   public String ValidationOfGreenKartButtonText() {
	   
		  String header =  ButtonText.getText();
		  return header;
	   }
	
   public void ClickGreenKartButtonText() {
	   
		  ButtonText.click();
		  
	   }
}



