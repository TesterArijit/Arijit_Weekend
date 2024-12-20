package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swap_text {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Sublime-HTML/html/swap_sl.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("tyo1"));
		           element.sendKeys("Selenium");
		WebElement element2 = driver.findElement(By.name("tyo2"));
		           element2.sendKeys("API");
		        
		      
		  element.sendKeys(Keys.CONTROL+"a");
		            Thread.sleep(2000);
		  element.sendKeys(Keys.CONTROL+"x");        
		  WebElement element3 = driver.findElement(By.name("tyo4"));  
		            Thread.sleep(2000);
		            element3.sendKeys(Keys.CONTROL+"v");
		            Thread.sleep(2000);
		           
		            element2.sendKeys(Keys.CONTROL+"a");
		            Thread.sleep(2000);
		            element2.sendKeys(Keys.CONTROL+"x");
		            Thread.sleep(2000);
		     	    element.sendKeys(Keys.CONTROL+"v");
	                Thread.sleep(2000);
		            element3.sendKeys(Keys.CONTROL+"a");
	                Thread.sleep(2000);
	                 element3.sendKeys(Keys.CONTROL+"x");
	                Thread.sleep(2000);
	                element2.sendKeys(Keys.CONTROL+"v");
		            Thread.sleep(4000);
		            driver.quit();

	}

}
