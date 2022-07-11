package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.ZerodhaByePOM;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSellPOM;
import utility.Excel;
import utility.ScreenShot;


public class ZerodhaByeStockTest {
	
	
	WebDriver driver;
	ZerodhaSellPOM sell = new ZerodhaSellPOM(driver);
	
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
		Thread.sleep(2000);
	}
	@Test
	public void ByeStock() throws InterruptedException  {
		ZerodhaByePOM zby = new ZerodhaByePOM(driver);
		zby.enterSearch("INFY");
		Thread.sleep(2000);
		zby.clicOnInfoShare();
		Thread.sleep(2000);
		zby.clickOnBuy();
		Thread.sleep(3000);
		zby.clickOnBuy1();
		Thread.sleep(3000);
		
		
		}
	
	@AfterMethod
	public void screenShot() throws IOException {
		ScreenShot.TakesScreenScreenShot(driver, "Zerodha");
		driver.close();
	}
	

}
