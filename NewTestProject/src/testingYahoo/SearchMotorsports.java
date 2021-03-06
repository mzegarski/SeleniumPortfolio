package testingYahoo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchMotorsports {
	
	WebDriver driver;
	
	@BeforeClass
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.get("http://www.yahoo.com/");
	
	}
	
/*	@AfterClass
	public void tearDown() {
		driver.close(); 
	}
*/	
	@Test
	public void testCase1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,30l);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='p'")));
		driver.findElement(By.cssSelector("input[name='p'")).sendKeys("motorsport.com");
		driver.findElement(By.cssSelector("button[id='uh-search-button']")).click();
		
	}

}
