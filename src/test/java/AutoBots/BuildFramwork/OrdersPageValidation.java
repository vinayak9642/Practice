package AutoBots.BuildFramwork;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutoBots.PomClasses.CheckoutPage;
import AutoBots.PomClasses.HomePage;
import AutoBots.PomClasses.ItemsPage;
import AutoBots.PomClasses.LoginPage;
import AutoBots.PomClasses.OrdersPage;
import AutoBots.Resourses.BaseClass;

public class OrdersPageValidation  extends BaseClass{


	// https://banavaths45.github.io/selinium/myorders
	
	@Test

	public void ValidationOfURLinOrdersPage() throws InterruptedException {
		
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
		Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.PromoCode();
		cp.PlaceOrder();
		cp.Checkout();
		
		OrdersPage op = new OrdersPage(driver);
		String url = op.UrlValidationOfOrder();
		Assert.assertEquals(url,"https://banavaths45.github.io/selinium/myorders");
	}
	
	@Test

	public void ValidationOfPageHeaderInOrdersPage() throws InterruptedException {
		
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
		Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.PromoCode();
		cp.PlaceOrder();
		cp.Checkout();
		
		OrdersPage op = new OrdersPage(driver);
		String Header = op.ValidationOfHeaderText();
		Assert.assertEquals(Header, "My Orders");
		
		
	}

	
	@Test

	public void ValidationOfGreenKartButtonText() throws InterruptedException {
		
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
		Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.PromoCode();
		cp.PlaceOrder();
		cp.Checkout();
		
		OrdersPage op = new OrdersPage(driver);
		String ButtonText = op.ValidationOfGreenKartButtonText();
		Assert.assertEquals(ButtonText,"GOTO GreenCart");
		
		
	}



	
	@Test

	public void ValidationOfItemsInOrderPage() throws InterruptedException {
		
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
		Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.PromoCode();
		cp.PlaceOrder();
		cp.Checkout();
		
		OrdersPage op = new OrdersPage(driver);
		List<String> list = op.ItemOfOrderValidation();
		Assert.assertEquals(list, name);
		
		
	}



    // POSITIVE FLOWWWWW


	
	@Test
	
	public void CompleteFlow () throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		String mylist[] = {"Cauliflower","Cucumber"};
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
	//	Thread.sleep(3000);
		
		ItemsPage ip = new ItemsPage(driver);
		String ItemsUrl = ip.UrlValidationOfHome();
		ip.BagButton();
	//	Thread.sleep(2000);
		
		CheckoutPage cp = new CheckoutPage(driver);    
		cp.PromoCode();
		cp.PlaceOrder();
		cp.Checkout();
		Thread.sleep(2000);
		
		OrdersPage op = new OrdersPage(driver);
		op.ClickGreenKartButtonText();
		Thread.sleep(2000);
		

		

	}
}
	
	
