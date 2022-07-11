package propertiesfiledemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {
	
	public static void main(String[] args) throws IOException {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ;
		
		ReadConfigFile configFile = new ReadConfigFile();
			
		//open url
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get(configFile.getUrl());
		
		//find username
		driver.findElement(By.id("txtUsername")).sendKeys(configFile.getUserName());
		//find password
		driver.findElement(By.id("txtPassword")).sendKeys(configFile.getPassword());
		//click on login
		driver.findElement(By.id("btnLogin")).click();
		
	//	driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		//close browser
		
		//driver.close();
			
			
		}
	}
	


