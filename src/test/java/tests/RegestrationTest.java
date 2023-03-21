package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegestrationPage;

public class RegestrationTest extends BaseTest{
	
	HomePage  HomePageObject; 
	RegestrationPage RegestrationPageObject;
	
	
	@Test
	public void UserRegisterSuccessfully() {
		
		HomePage HomePageObject = new HomePage(driver);
		RegestrationPage RegestrationPageObject = new RegestrationPage(driver);
		
		HomePageObject.OpenRegisterpage();
		RegestrationPageObject.Registration("mugaheeeeed", "zainnnnn", "mugahedzain36633@gmail.com", "123456");
		Assert.assertTrue(RegestrationPageObject.SuccessfullMessage.getText().contains("Your registration completed"));
		
		
	}

}
