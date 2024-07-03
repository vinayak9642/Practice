package AutoBots.BuildFramwork;


import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutoBots.DataDriven.DataDriven;
import AutoBots.DataDriven.DataDrivens;
import AutoBots.PomClasses.HomePage;
import AutoBots.PomClasses.LoginPage;
import AutoBots.PomClasses.ValidationPage;
import AutoBots.Resourses.BaseClass;


public class LoginPageValidation extends BaseClass {
	
	
	@Test
	public void ValidationOfLoginPageTitle() {
	
		LoginPage lp = new LoginPage(driver);
		lp.PageTitle();
		
		 
	
	 }
	@Test(groups = {"group1"})
	public void ValidationsOfLoginPageUrl() {
		
		LoginPage lp = new LoginPage(driver);
		lp.UrlValidation();
	}
	
	@Test(groups = {"group1"})
	
	public void ValidCredentials () throws IOException {

		DataDrivens dd = new DataDrivens();
		Object[][] data = dd.getdata();
		

		String UserName = data [2][0].toString();
		String Password = data [2][1].toString();
		
		
		System.out.println(UserName +" "+ Password);
		LoginPage lp = new LoginPage(driver);
		lp.ValidLogin(UserName,Password);
		
		
	}
	
	
	@Test
	public void InValidCredentials () throws IOException {
		
		DataDrivens dd = new DataDrivens ();
		Object[][] data = dd.getdata();
		
		String UserName = data[1][0].toString();
		String Password = data[1][1].toString();
		
		System.out.println(UserName +" "+ Password);
		LoginPage lp = new LoginPage(driver);
		lp.InValidLogin(UserName, Password);
		
		
					
	}
	
	
	@Test
	public void ValidationOfForgotPasswordLink() {
	
		LoginPage lp = new LoginPage(driver);
		lp.ForgotPassword();

	}
	
	@Test
	public void ValidationOfForgotPasswordFields() {
		LoginPage lp = new LoginPage(driver);
		lp.ForgotPasswordFields();
		
	}
	
	@Test
	public void ValidationOfGotoLoginButton() {
		LoginPage lp = new LoginPage(driver);
		lp.GotoLoginButton();
		
	}
	
	@Test(groups = {"group1"})
	public void ValidationOfSiginButtonText() {

		
		ValidationPage vt = new ValidationPage(driver);
		String SiginText = vt.SiginV();
		Assert.assertEquals(SiginText, "Sign in");
	}
	
 }


