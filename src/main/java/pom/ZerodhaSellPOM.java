package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSellPOM {
	public WebDriver driver;
	
	@FindBy (css = "button[class='button-orange sell']") private WebElement sell;
	@FindBy (xpath ="//span[text()='TCS']") private WebElement tcs;
	@FindBy (css = "input[value='BSE']") private WebElement bse;
	@FindBy (css = "input[value='NSE']") private WebElement nse;
	@FindBy (xpath = "(//label[@class='su-radio-label'])[7]") private WebElement intraday;
	@FindBy (css = "input[label='Qty.']") private WebElement qty;
	@FindBy (css = "input[label='Price']") private WebElement price;
	@FindBy (css = "input[label='Trigger price']") private WebElement triggerPrice;
	@FindBy (css = "input[value='MARKET']") private WebElement market;
	@FindBy (css = "a[class='text-xsmall more-options']") private WebElement moreOptions;
	@FindBy (css = "a[data-balloon='Refresh']") private WebElement refresh;
	@FindBy (css = "button[class='submit']") private WebElement sell1;
	@FindBy (css = "button[class='button-outline cancel']") private WebElement cancel;
	
	
	public ZerodhaSellPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public  WebElement clicOnTcsShare() throws InterruptedException {
		tcs.click();
	    Thread.sleep(1000);

	    return tcs;	 
	}
	
	public void clickOnSell() throws InterruptedException {
		sell.click();
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
	public void clickOnSell1() {
		sell1.click();
	}
	

}
