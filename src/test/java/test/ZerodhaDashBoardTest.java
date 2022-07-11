package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerothaDashDashboardPOM;
import utility.BaseClass;
import utility.Excel;
import utility.ScreenShot;

public class ZerodhaDashBoardTest extends BaseClass {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException {
		driver = Browser.chromeBrowser();
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
	}
	@Test
	public void dashboard() throws EncryptedDocumentException, IOException, InterruptedException {
		
		ZerothaDashDashboardPOM zpom = new ZerothaDashDashboardPOM(driver);
        Thread.sleep(5000);
		zpom.enterSearch("TataSteel");
		zpom.clickOnStartInvesting();
	}
	
	@AfterMethod
	public void screenShot() throws IOException {
		ScreenShot.TakesScreenScreenShot(driver, "Zerodha");
		//driver.close();
	}

}
