package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerothaSignUpAccount {
	WebDriver driver;
	
	@FindBy (xpath = "//a[contains(text(),'Signup now!')]") private WebElement signUp; 
	
	@FindBy (xpath = "//input[@type='text']") private WebElement mobileNumber;
	
	@FindBy (xpath = "//button[@id='open_account_proceed_form']") private WebElement continue2;
	
	@FindBy (xpath ="//a[contains(text(),'Want to open an NRI ')]") private WebElement nriAccount;
	
	
	public ZerothaSignUpAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignUp() {
		signUp.click();
		
	}
	
	public void enterMobileNumber(String MobileNumber) {
	
		mobileNumber.sendKeys(MobileNumber);
		
	}
	
	public void clickOnContinue(String Continue) {
		continue2.click();
	}
	
	public void clickOnNRIAccount(String NRIAccount) {
		nriAccount.click();
	}
}
