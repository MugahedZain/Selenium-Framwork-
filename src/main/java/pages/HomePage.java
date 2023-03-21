package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(className = "ico-register")
	WebElement Registerlink;
	
	public void OpenRegisterpage() {
		
		//*brfore enhancements**/ 
		//Registerlink.click();      
		
		clickButton(Registerlink);
	}

}
