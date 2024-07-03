package AutoBots.PomClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import AutoBots.Utilities.AbstractComponents;

public class CheckoutPage extends AbstractComponents {

WebDriver driver;
	public  CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
 
	@FindBy (xpath="//h1[text()='CGT']")
	WebElement logo3;
	
	@FindBy (xpath="//button[text()='Apply']")
	WebElement apply;
	
	@FindBy (xpath="//input[@class='promoCode']")
	WebElement promo;
	
	@FindBy (xpath="//button[@class='cartbutton1']")
	WebElement order;
	

	@FindBy (xpath="//h3[text()='item has been placed successfully']")
	WebElement success;
	
	By path = By.xpath ("//h3[text()='item has been placed successfully']");
	
	@FindBy (xpath="//h4[@class=\"close\"]")
	WebElement done;
	

	@FindBy (xpath = "//tbody/tr/td[2]")
	List<WebElement> Products;
	
 	public String validationOfCheckoutPage() {
		
		String Homeurl = driver.getCurrentUrl();
		return Homeurl;
		
	}
 	
 	@Test
	public void PageTitleofCP() {
		
		String original = driver.getTitle();
		Assert.assertEquals(original, "React App");
 	}	
 	
public String ValidationOfLogo() {
		
	String text = logo3.getText();
		
		return text;
	}
 	
 	
public String ValidationOfApplyT() {
	
	String text2 = apply.getText();
		
		return text2;
	}
 	
public void PromoCode() {
	
	promo.sendKeys("Love");
	apply.click();
	driver.switchTo().alert().accept();
	}

	public void PlaceOrder() {
	
	order.click();
	scrolldown(driver);
	
	}


	public String SucessfullPlaced() {
	
	String placed = success.getText();
	return placed;
	
	}
 	

	public void Checkout() {
	    waits(path);
		done.click();
	
	}

	public List<String> ItemsValidation() {
   List<String> mylist = new ArrayList();
   for(WebElement getit : Products) {
	   String list = getit.getText();
	   mylist.add(list);
	   
   }
   return mylist;
   
   
   
   }
}

