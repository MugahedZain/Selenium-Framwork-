package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected WebDriver driver;
	
	//Create Constructor 
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	protected static void clickButton(WebElement button) {
		
		button.click();
	}
	
	protected static void sendkeyTxtElement(WebElement TxtElement,String value){
		
		TxtElement.sendKeys(value);
	}

}
