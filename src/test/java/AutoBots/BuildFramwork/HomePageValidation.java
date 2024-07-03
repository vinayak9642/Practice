package AutoBots.BuildFramwork;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutoBots.PomClasses.HomePage;
import AutoBots.PomClasses.ItemsPage;
import AutoBots.PomClasses.LoginPage;
import AutoBots.Resourses.BaseClass;

public class HomePageValidation extends BaseClass {
	
	@Test
	public void ValidationOfHomePageLogo() {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);

		HomePage hp = new HomePage(driver);
		String Cgt = hp.logoValidation();
		Assert.assertEquals(Cgt, "CGT");
	}
	 
	
	
	@Test
	public void ValidationOfHomeButtonsText() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
		
		
		HomePage hp = new HomePage(driver);
		String txt= hp.ValidationOfHomeButtonText();
		Assert.assertEquals(txt, "Home");
	}	
	
	
	
	@Test
	public void ValidationOfGreenKartTextAndButton() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
		
		
		HomePage hp = new HomePage(driver);
		String txt= hp.ValidationOfGreenKartTextButtons();
		Assert.assertEquals(txt,"GreenKart");
		hp.GreenKartButton();
	}	
	
	
	@Test
	public void ValidationOfHomePageTitle() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
		
		
		HomePage hp = new HomePage(driver);
		String titles= hp.TitleValidation();
		Assert.assertEquals(titles, "I'AM ANURAG");
	}
	
	
	@Test
	public void ValidationOfWelcomeHeaderInHomepage() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
		
		
		HomePage hp = new HomePage(driver);
		String header2 = hp.WelcomeValidation();
		Assert.assertEquals(header2, "WELCOME TO JAVA SELENIUM COURSE");
	}

	
	@Test
	public void ValidationOfURLInHomepage() {
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
		
		
		HomePage hp = new HomePage(driver);
		String homeurl = hp.UrlValidationOfHome();
		Assert.assertEquals(homeurl, "https://banavaths45.github.io/selinium/home");
		
	}
	
	@Test
	
	public void FlowOfHomePage () throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String UserName = "cgtacademy";
		String Password = "cgt@123";
		lp.ValidLogin(UserName,Password);
	
		HomePage hp = new HomePage(driver);
	    String homeurl = hp.UrlValidationOfHome();
		Assert.assertEquals(homeurl, "https://banavaths45.github.io/selinium/home");
		
	
		
		hp.GreenKartButton();
		Thread.sleep(1000);
	}
	
	
	

	
}


	
	

