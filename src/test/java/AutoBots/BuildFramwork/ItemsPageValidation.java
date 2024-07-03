package AutoBots.BuildFramwork;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutoBots.PomClasses.HomePage;
import AutoBots.PomClasses.ItemsPage;
import AutoBots.PomClasses.LoginPage;
import AutoBots.Resourses.BaseClass;

public class ItemsPageValidation extends BaseClass {

	
	
@Test
	
	public void ValidationOfUrlInItemsPage () throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		String mylist[] = {"Cauliflower","Cucumber"};
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		Thread.sleep(1000);
	
		ItemsPage ip = new ItemsPage(driver);
		String ItemsUrl = ip.UrlValidationOfHome();
		Assert.assertEquals(ItemsUrl, "https://banavaths45.github.io/selinium/greenkart");
	
	}
//<include name="ValidationOfItemsPageLogo"></include>
//<include name="ValidationofSearchBox"></include>
//<include name="ValidationOfTitleKart"></include>
//<include name="FlowOfItemsPage"></include>
//</methods
//	
	
	
	@Test (groups = {"vinay"})

	public void ValidationOfItemsPageLogo() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		ItemsPage ip = new ItemsPage(driver);
	String logos = 	ip.LogoItems();
		Assert.assertEquals(logos,"CGT");
		
	}
	
	@Test(groups = {"vinay"})

	public void ValidationOfTitleGreen() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		ItemsPage ip = new ItemsPage(driver);
		String green = 	ip.Greenvalidation();
		Assert.assertEquals(green,"GREEN");
		
	}
	
	
	@Test(groups = {"vinay"})

	public void ValidationofSearchBox() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		ItemsPage ip = new ItemsPage(driver);
		ip.ValidationOfSearchBox();
		
	}

	@Test(groups = {"vinay"})

	public void ValidationOfTitleKart() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		ItemsPage ip = new ItemsPage(driver);
		String kart = 	ip.KartValidation();
		Assert.assertEquals(kart,"KART");
		
	}
	
	
	
	
	@Test

	public void ValidationOfDeletingTheProduct() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		ItemsPage ip = new ItemsPage(driver);
		ip.DeletingItem();
		
	}
	
	@Test

	public void ValidationOfCheckoutButtonWithOutSelectingItems() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		ItemsPage ip = new ItemsPage(driver);
		ip.ValidatingTheBag();
		System.out.println("BUG AT iTEMS PAGE ON ValidationOfCheckoutButtonWithOutSelectingItems");
		
	}
	
	
	
	
	@Test

	public void ValidationOfIncrementAndDecrementButton() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		ItemsPage ip = new ItemsPage(driver);
		ip.IncrementAndDecrement();
		
	}
	
	@Test

	public void ValidatingTheNubmberOfItems() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		ItemsPage ip = new ItemsPage(driver);
		String numbers = ip.ValidatingTheNubmberOfItems();
		Assert.assertEquals(numbers, "2 Kg");
		System.out.println("Just  done ValidatingTheNubmberOfItems And its a Bug ");
		
	}
	
	
	
	
	@Test(groups = {"vinay"})
	
	public void FlowOfItemsPage () throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		String mylist[] = {"Cauliflower","Cucumber"};
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
		hp.GreenKartButton();
		Thread.sleep(1000);
		
		ItemsPage ip = new ItemsPage(driver);
		ip.AddItemsToKart(mylist);
		ip.BagButton();
		Thread.sleep(3000);
		

	}
}

