package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenuim1 {
	
WebDriver driver;

	//Launch FireFox browser 
	public void browserLaunch() {
		System.setProperty("webdriver.gecko.driver","C:/Program Files/SeleniumGecko/geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.get("https://www.ebay.com/");
		driver.navigate().to("https://www.ebay.com/"); // Launch web site 1 
		
	}
	
	//Search the products and select one product  
	public void productSearch() throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("School Bags"); // Give Key word for searching
		driver.findElement(By.cssSelector("#gh-btn")).click(); //Click search button
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("#item3680d287e6 > div > div.s-item__image-section > div > a > div")).click(); //Select one product 

	}
	
	//Launch new web site 
	public void navigate() throws InterruptedException {
		Thread.sleep(2500);
		driver.navigate().to("https://www.aliexpress.com/");
		Thread.sleep(2500);
		driver.navigate().back();
		
	}
	
	//Close all browser windows 
	public void browserClose() {
		driver.quit();
		}

	public static void main(String[] args) throws InterruptedException {
		TestSelenuim1 obj = new TestSelenuim1();
		obj.browserLaunch();
		obj.productSearch();
		obj.navigate();
		obj.browserClose();

	}

}
