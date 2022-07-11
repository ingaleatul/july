package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ListCharSharePOM;

import pom.ZerodhaLoginPage;
import utility.Excel;

public class ListCharShareTest {
	
	public class ZerodhaHomePageTest {
		
		public WebDriver driver;
		
		@BeforeMethod
		public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException  {
			driver = Browser.chromeBrowser();
			ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
			String userId = Excel.getData("Zerodha", 0, 1);
			String pass = Excel.getData("Zerodha", 1, 1);
			String pin = Excel.getData("Zerodha", 2, 1);
			zerodhaLoginPage.enterUserId(userId);
			zerodhaLoginPage.enterpass(pass);
			zerodhaLoginPage.clickOnLogin();
			Thread.sleep(3000);
			zerodhaLoginPage.enterPin(pin);
			zerodhaLoginPage.clickOnContinue();
			}
		@Test
		public void listsOfBuyStocks() throws InterruptedException, EncryptedDocumentException, IOException {
			ListCharSharePOM listChar = new ListCharSharePOM(driver); 
		
			listChar.enterStockToSearch("TATAMOTORS");
			
		}
	}

}
