package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload_popup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String Key="webdriver.chrome.driver";
		String Value="./Software/chromedriver.exe";
		
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(2000);
			
		WebElement e1 = driver.findElement(By.xpath("(//a[.='4.25.0 (September 20, 2024)'])[3]"));
		Point p = e1.getLocation();
		int y = p.getY();
		System.out.println(y);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		e1.click();
		
						
		Robot a =new Robot();
		a.keyPress(KeyEvent.VK_CONTROL);
	    a.keyPress(KeyEvent.VK_J);
	    a.keyRelease(KeyEvent.VK_CONTROL);
		a.keyRelease(KeyEvent.VK_J);
		Thread.sleep(3000);
		driver.quit();

	}

}
