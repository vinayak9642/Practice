package AutoBots.BuildFramwork;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutoBots.PomClasses.CheckoutPage;
import AutoBots.PomClasses.HomePage;
import AutoBots.PomClasses.ItemsPage;
import AutoBots.PomClasses.LoginPage;
import AutoBots.Resourses.BaseClass;

public class ChcekOutPageValidatio extends BaseClass {

	
	
@Test
	
	public void ValidationOfURLinCheckoutPage () throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		String mylist[] = {"Cauliflower","Cucumber"};
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
	//	Thread.sleep(3000);
		
		ItemsPage ip = new ItemsPage(driver);
		ip.BagButton();
	//	Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);
		String checkPageUrl = cp.validationOfCheckoutPage();
		Assert.assertEquals(checkPageUrl, "https://banavaths45.github.io/selinium/greenkart");  
	
	}
	
	
	
	@Test
	
	public void ValidationOfTitleCheckPage() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		String mylist[] = {"Cauliflower","Cucumber"};
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		
		ItemsPage ip = new ItemsPage(driver);
		ip.AddItemsToKart(mylist);
		ip.BagButton();
	//	Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.PageTitleofCP();
	}
	
	
	
	
	@Test
	
	public void ValidationOfLogoCheckPage() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		String mylist[] = {"Cauliflower","Cucumber"};
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		
		ItemsPage ip = new ItemsPage(driver);
		ip.AddItemsToKart(mylist);
		ip.BagButton();
	//	Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);
		String logo = cp.ValidationOfLogo();
		Assert.assertEquals(logo,"CGT");
	}
	
	
@Test
	
	public void ValidationOfApplyButtonText() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		String mylist[] = {"Cauliflower","Cucumber"};
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		
		ItemsPage ip = new ItemsPage(driver);
		ip.AddItemsToKart(mylist);
		ip.BagButton();
	//	Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);
		String applytext = cp.ValidationOfApplyT();
		Assert.assertEquals(applytext, "Apply");
	}



@Test

public void PlaceOrderButton() throws InterruptedException {
	
	LoginPage lp = new LoginPage(driver);
	String UserName = "cgtacademy";
	String Password = "cgt@123";
	String mylist[] = {"Cauliflower","Cucumber"};
	lp.ValidLogin(UserName,Password);

	HomePage hp = new HomePage(driver);
	hp.GreenKartButton();
	
	ItemsPage ip = new ItemsPage(driver);
	ip.AddItemsToKart(mylist);
	ip.BagButton();
//	Thread.sleep(2000);
	
	CheckoutPage cp = new CheckoutPage(driver);
	cp.PlaceOrder();
	
	}


@Test

public void ValidationOfSuccesfullyPlacedText() throws InterruptedException {
	
	LoginPage lp = new LoginPage(driver);
	String UserName = "cgtacademy";
	String Password = "cgt@123";
	String mylist[] = {"Cauliflower","Cucumber"};
	lp.ValidLogin(UserName,Password);

	HomePage hp = new HomePage(driver);
	hp.GreenKartButton();
	
	ItemsPage ip = new ItemsPage(driver);
	ip.AddItemsToKart(mylist);
	ip.BagButton();
//	Thread.sleep(2000);
	
	CheckoutPage cp = new CheckoutPage(driver);
	cp.PromoCode();
	cp.PlaceOrder();
	String placed = cp.SucessfullPlaced();
	Assert.assertEquals(placed, "item has been placed successfully");

}
	

@Test

public void ValidationOfSelectedItems() throws InterruptedException {
	
	LoginPage lp = new LoginPage(driver);
	String UserName = "cgtacademy";
	String Password = "cgt@123";
	lp.ValidLogin(UserName,Password);
	
	String mylist[] = {"Cauliflower","Cucumber"};
	List<String> name = Arrays.asList(mylist);
	

	HomePage hp = new HomePage(driver);
	hp.GreenKartButton();
	
	ItemsPage ip = new ItemsPage(driver);
	ip.AddItemsToKart(mylist);
	ip.BagButton();
//	Thread.sleep(2000);
	
	CheckoutPage cp = new CheckoutPage(driver);
	List<String> items = cp.ItemsValidation();
	Assert.assertEquals(items, name);

}


@Test

public void ValidationOfApplyPromoCode() throws InterruptedException {
	
	LoginPage lp = new LoginPage(driver);
	String UserName = "cgtacademy";
	String Password = "cgt@123";
	lp.ValidLogin(UserName,Password);
	
	String mylist[] = {"Cauliflower","Cucumber"};
	List<String> name = Arrays.asList(mylist);
	

	HomePage hp = new HomePage(driver);
	hp.GreenKartButton();
	
	ItemsPage ip = new ItemsPage(driver);
	ip.AddItemsToKart(mylist);
	ip.BagButton();
//	Thread.sleep(2000);
	
	CheckoutPage cp = new CheckoutPage(driver);
	cp.PromoCode();

}
	
	@Test
	
	public void FlowOfCheckoutPage () throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		String mylist[] = {"Cauliflower","Cucumber"};
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
	//	Thread.sleep(3000);
		
		ItemsPage ip = new ItemsPage(driver);
		ip.BagButton();
	//	Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);    
		cp.PromoCode();
		cp.PlaceOrder();
		cp.Checkout();
	//	Thread.sleep(2000);
		

	}
}

