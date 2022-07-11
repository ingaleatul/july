package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaByePOM {
	public WebDriver driver;
	
    @FindBy (css   = "[icon='search']") private WebElement searchbox;
	@FindBy (xpath = "//span[text()='INFY']") private WebElement info;
	@FindBy (css   = "button[class='button-blue buy']") private WebElement buy;
	@FindBy (xpath = "//input[@id='radio-223']") private WebElement bse;
	@FindBy (xpath = "//input[@id='radio-224']") private WebElement nse;
	@FindBy (xpath = "//input[@id='radio-231']") private WebElement intraday;
	@FindBy (xpath = "//input[@type='number'][@label='Qty.']") private WebElement qty;
	@FindBy (xpath = "//input[@type='number'][@label='Price']") private WebElement price;
	@FindBy (xpath = "//input[@id='radio-237']") private WebElement market;
	@FindBy (xpath = "//input[@id='radio-238']") private WebElement limit;
	@FindBy (xpath = "//input[@id='radio-240']") private WebElement sl;
	@FindBy (xpath = "//input[@id='radio-241']") private WebElement slm;
	@FindBy (xpath = "//span[text()='More options ']") private WebElement moreOptions;
	@FindBy (xpath = "//input[@label='Trigger price']") private WebElement triggerPrice;
	@FindBy (xpath = "//span[text()='Target']") private WebElement target;
	@FindBy (xpath = "//a[@data-balloon='Refresh']") private WebElement refresh;
	@FindBy (xpath = "//button[@type='submit']") private WebElement bye;
	@FindBy (xpath = "//button[@class='button-outline cancel']") private WebElement cancel;
	
	public ZerodhaByePOM (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterSearch (String name)  {
		searchbox.sendKeys(name);
		searchbox.sendKeys(Keys.ENTER);	
	}
	public  WebElement clicOnInfoShare() throws InterruptedException {
		info.click();
	    Thread.sleep(1000);
//	    Actions act=new Actions(driver);
//	   	act.moveToElement(info).perform();
//	   	info.click();
	    return info;	 
	}
	
	public void clickOnBuy() throws InterruptedException {
		buy.click();
	}
	public void clickOnIntraday() {
		intraday.click();
		
	}
	public void enterQuntity(String qun) {
		qty.sendKeys(qun);
	}
	public void enterPrice(String Price) {
		price.sendKeys(Price);
	}
	public void clickOnMarket() {
		market.click();
	}
	public void clickOnRefresh() {
		refresh.click();
	}
	public void clickOnBuy1() {
		bye.click();
	}
		
}
