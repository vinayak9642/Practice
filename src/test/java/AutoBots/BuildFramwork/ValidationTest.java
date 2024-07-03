package AutoBots.BuildFramwork;

import org.testng.Assert;
import org.testng.annotations.Test;


import AutoBots.PomClasses.ValidationPage;
import AutoBots.Resourses.BaseClass;

@Test
public class ValidationTest extends BaseClass {
	 
	

	
	
	
	@Test
	public void ValidationOfCheckBoxText1() {
		ValidationPage vt = new ValidationPage(driver);
	    String remember = vt.RememberV();
	    Assert.assertEquals(remember, "Remember my username");
	
	 }
	@Test
	public void ValidationOfCheckBoxText2() {
		ValidationPage vt = new ValidationPage(driver);
	    String privacy = vt.TearmsAndPolicyValidation();
	    Assert.assertEquals(privacy, "I agree to the terms and privacy policy.");
	
	 }
	
	@Test
	 	public void ValidationOfHeaderText1() {
		ValidationPage vt = new ValidationPage(driver);
	    String Title = vt.HeaderTitle();
	    Assert.assertEquals(Title, "CGT Academy");
	

	
}
	
	@Test
	public void ValidationOfForgotPasswordText() {
		ValidationPage vt = new ValidationPage(driver);
		String FP = vt.ForgotPassword();
		Assert.assertEquals(FP, "Forgot your password?");
		
		
	}
	@Test
	public void ValidationOfHeaderText2() {
		
		ValidationPage vt = new ValidationPage(driver);
		String MV = vt.Subtitle();
		Assert.assertEquals(MV, "An Academy to Learn Earn & Shine in your QA Career");
		
	}
	

	
}
