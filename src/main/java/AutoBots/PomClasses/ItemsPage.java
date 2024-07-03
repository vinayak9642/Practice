package AutoBots.PomClasses;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsPage {

WebDriver driver;

	public ItemsPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//h1[text()='CGT']")
	WebElement logoI;
	

	@FindBy (xpath = "//div/h6")
	List<WebElement> Items;
	
	@FindBy (xpath="//span[text()='GREEN']") 
	WebElement green;
	
	@FindBy (xpath="//span[text()='KART']")
	WebElement kart;
	
	@FindBy (className = "cartbutton")
	List<WebElement> Addtokart;
	
	@FindBy (xpath = "//button[@class='proceed-btn']")
	WebElement proceedToPay;
	

	@FindBy (xpath="//div[@class=\"shopping-bag\"]")
	WebElement bag;
	
	@FindBy (xpath="//input[@type=\"search\"]")
	WebElement search;
	
	@FindBy (xpath="//div[@class=\"delete\"]")
	WebElement delete;
	
	@FindBy (xpath="//button[@class=\"cartbutton\"]")
	WebElement add;
	
	@FindBy (xpath="//button[@class=\"incbtn\"]")
	WebElement increment;
	
	@FindBy (xpath="//button[@class=\"decbtn\"]")
	WebElement decrement;
	
	@FindBy (xpath="(//div/p)[4]")
	WebElement kgs;
	

	
	
	public String UrlValidationOfHome() {
		
		String Homeurl = driver.getCurrentUrl();
		return Homeurl;
		
	}

	public String LogoItems() {
		
	String logos = logoI.getText();
	return logos;
	
		
	}
	public String Greenvalidation() {
		
		String title = green.getText();
		return title;
		
	}
	
	public String KartValidation() {
		
		String title2 = kart.getText();
		return title2;
		
	}
	
	public void ProceedToPayButton() {
	proceedToPay.click();
				
	}
	
	public void ValidationOfSearchBox() {
		search.sendKeys("ca");
					
		}
	
	
	public void AddItemsToKart(String[] mylist) throws InterruptedException {
		List MyItems = Arrays.asList(mylist);
	
		for(int i = 0; i<Items.size();i++) {
			
			String[] reqItem = 	Items.get(i).getText().split("-");
				String veggies = reqItem[0].trim();
				
				if (MyItems.contains(veggies)) {
					
					Thread.sleep(2000);
					Addtokart.get(i).click();
				
		         }
		}
		
		
	}
	
	public void BagButton() {
		
		bag.click();
		proceedToPay.click();
		
	}
	
	
	public void DeletingItem() throws InterruptedException {
		add.click();
		bag.click();
		delete.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	public void ValidatingTheBag() throws InterruptedException {
		
		bag.click();
		proceedToPay.click();
		Thread.sleep(1000);
		}
	
	public String ValidatingTheNubmberOfItems() throws InterruptedException {
		

		increment.click();
		add.click();
		bag.click();
		String number = kgs.getText();
		
		return number;
		}
	
	
	public void IncrementAndDecrement() throws InterruptedException {
		increment.click();
		increment.click();
		Thread.sleep(2000);
		
		decrement.click();
	}

	
}
