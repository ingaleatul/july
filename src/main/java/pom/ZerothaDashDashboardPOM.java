package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerothaDashDashboardPOM {
	
	@FindBy (xpath= "//input[@icon='search']") private WebElement searchbar;
	@FindBy (xpath = "//a[@class='router-link-active']") private WebElement dashboard;
	@FindBy (xpath = "//a[@class='orders-nav-item']") private WebElement orders;
	@FindBy (xpath = "//span[@xpath='1']") private WebElement holdings;
	@FindBy (xpath = "//span[text()='Positions']") private WebElement positions;
	@FindBy (xpath = "//span[text()='Funds']") private WebElement funds;
	@FindBy (xpath = "//span[text()='Apps']") private WebElement apps;
	@FindBy (xpath = "//span[text()='AY']") private WebElement ay;
	@FindBy (xpath = "(//button[@type='button'])[1]") private WebElement startinvesting;
	@FindBy (xpath = "(//button[@type='button'])[2]") private WebElement getStarted;
	
	public ZerothaDashDashboardPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterSearch(String name) {
		searchbar.sendKeys(name);
	}
	public void clickOnDashBoard() {
		dashboard.click();
	}
	public void clickOnOrders() {
		orders.click();
	}
	public void clickOnHoldings() {
		holdings.click();
	}
	public void clickOnPositions() {
		positions.click();
	}
	public void clickOnFunds() {
		funds.click();
	}
	public void clickOnApps() {
		apps.click();
	}
	public void clickOnAy() {
		ay.click();
	}
	public void clickOnStartInvesting() {
		startinvesting.click();
	}
	public void clickOnGetStarted() {
		getStarted.click();
	}

}
