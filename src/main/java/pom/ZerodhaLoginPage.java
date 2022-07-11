package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	
	@FindBy (xpath = "//input[@id='userid']") private WebElement userId;
	@FindBy (xpath = "//input[@id='password']")private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement login;
	@FindBy (xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy (xpath = "//button[@class='button-orange wide']") private WebElement continue1;
	@FindBy (xpath = "//a[text()='Forgot 2FA?']") private WebElement forgotPin;
	@FindBy (xpath = "//a[contains(text(),'Forgot user ID ')]") private WebElement forgot;
	@FindBy (xpath = "//img[@alt='Kite Android']") private WebElement playStore;
	@FindBy (xpath = "//img[@alt='Kite iOS']") private WebElement appleStore;
	@FindBy (xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String UserId) {
		userId.sendKeys(UserId);
	}
	public void enterpass(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		login.click();;
	}
	public void enterPin(String Pin) {
		pin.sendKeys(Pin);
	}
	public void clickOnContinue() {
		continue1.click();
	}
	public void clickOnForgotPin() {
		forgotPin.click();
	}
	public void clickOnForgot() {
	    forgot.click();
	}
	public void clickOnPlayStore() {
		playStore.click();
	}
	public void clickOnAppleStore() {
		appleStore.click();
	}
	
}
