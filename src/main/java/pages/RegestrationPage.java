package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegestrationPage extends BasePage {

	public RegestrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "gender-male")
	WebElement GenderRadioBtn;
	
	@FindBy(id = "FirstName")
	WebElement FirstNameTxtBox;
	
	@FindBy(id = "LastName")
	WebElement LastNameTxtBox;
	
	@FindBy(id = "Email")
	WebElement EmailTxtBox;
	
	@FindBy(id = "Password")
	WebElement PasswordTxtBox;
	
	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmPasswwordTxtBox;
	
	@FindBy(id = "register-button")
	WebElement RegisterBtn;
	
	@FindBy(css = "div.result")
	public WebElement SuccessfullMessage;
	
	
	public void Registration(String FirstName, String LastName, String Email, String Password) {
		clickButton(GenderRadioBtn);
		sendkeyTxtElement(FirstNameTxtBox, FirstName);
		sendkeyTxtElement(LastNameTxtBox, LastName);
		sendkeyTxtElement(EmailTxtBox, Email);
		sendkeyTxtElement(PasswordTxtBox, Password);
		sendkeyTxtElement(ConfirmPasswwordTxtBox, Password);
		clickButton(RegisterBtn);
	}

}
