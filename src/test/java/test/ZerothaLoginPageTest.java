package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.BaseClass;
import utility.Excel;
import utility.ScreenShot;
@Listeners(utility.Listeners.class)
public class ZerothaLoginPageTest extends BaseClass {
	
	
	@BeforeMethod
	public void openBrowser() {
		
		driver = Browser.chromeBrowser();
	}
	@Test(timeOut = 1000)
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userId = Excel.getData("Zerodha", 0, 1);
		String pass = Excel.getData("Zerodha", 1, 1);
		String pin = Excel.getData("Zerodha", 2, 1);
		zerodhaLoginPage.enterUserId(userId);
		zerodhaLoginPage.enterpass(pass);
		zerodhaLoginPage.clickOnLogin();
		Thread.sleep(2000);
		zerodhaLoginPage.enterPin(pin);
		zerodhaLoginPage.clickOnContinue();
		Thread.sleep(2000);
	}
	
	@Test(timeOut = 2000)
	public void test() throws InterruptedException {
		Thread.sleep(4000);
	}

//	@AfterMethod
//	public void screenShot() throws IOException {
//		ScreenShot.TakesScreenScreenShot(driver, "Zerodha");
//		driver.close();
//	}
		
}
