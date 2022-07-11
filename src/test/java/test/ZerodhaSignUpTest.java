package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerothaSignUpAccount;
import utility.Excel;
import utility.ScreenShot;

public class ZerodhaSignUpTest {
	
	WebDriver driver ;
	String signUp;
	@BeforeMethod
	public void openBrowser() {
		
	driver = Browser.chromeBrowser();
	 signUp = driver.getWindowHandle();
	}
	
	@Test
	public void signUpTest() throws EncryptedDocumentException, IOException, InterruptedException {
		 ZerothaSignUpAccount zerothaSignUpAccount = new ZerothaSignUpAccount(driver);
		 zerothaSignUpAccount.clickOnSignUp();

		
		 Set<String> handle = driver.getWindowHandles();
		 Iterator <String> i = handle.iterator();
		 String handle1 = i.next();
		 System.out.println(handle1);
		 String handle2 = i.next();
		 System.out.println(handle2);
		 driver.switchTo().window(handle2);
		 String mobileNumber = Excel.getData("Sheet2", 1, 1);
	     zerothaSignUpAccount.enterMobileNumber(mobileNumber);
	     zerothaSignUpAccount.clickOnContinue(mobileNumber);
	    }
	
	public void screenShot() throws IOException {
		ScreenShot.TakesScreenScreenShot(driver, "Zerotha");
	}
	
	
}


