package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListCharSharePOM {
	
	@FindBy (css   = "input[icon='search']") private WebElement search;
	@FindBy (xpath   = "//span[@class='nice-name']") private List <WebElement> shares;
	@FindBy (xpath   = "//button[@class='button-blue buy']") private WebElement watchListBuy;
	
public ListCharSharePOM(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterStockToSearch(String stock) {
		search.sendKeys(stock);
		search.sendKeys(Keys.ENTER);
		
		}
	
//	public void selectShareFromWatchListAndBuy(WebDriver driver)  {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
//		wait.until(ExpectedConditions.visibilityOf(search));
//		
		
			}
		//}
	//}
	

//}
