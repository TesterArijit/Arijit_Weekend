package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPage_rightclick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='collapse navbar-collapse justify-content-end']/ul/li"));
		
		Actions a=new Actions(driver);
		Robot r=new Robot();
		
		for(WebElement ele:all)
		{
			a.contextClick(ele).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.quit();
	
	}

}
