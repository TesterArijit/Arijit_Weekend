package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearValue_without_clearMethod {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Sublime-HTML/html/clear.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	WebElement e=driver.findElement(By.name("pp1"));
	           e.sendKeys("selenium");
	       	Thread.sleep(2000);
	       	e.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	       	Thread.sleep(1000);
	       	driver.quit();
	
	}

}
