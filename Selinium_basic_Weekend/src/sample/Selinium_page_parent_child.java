package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selinium_page_parent_child {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.xpath("//a[.='About']"));
		WebElement e2 = driver.findElement(By.xpath("//a[.='Downloads']"));
		WebElement e3 = driver.findElement(By.xpath("//a[.='Documentation']"));
		WebElement e4 = driver.findElement(By.xpath("//a[.='Projects']"));
		WebElement e5 = driver.findElement(By.xpath("//a[.='Support']"));
		WebElement e6 = driver.findElement(By.xpath("//a[.='Blog']"));
		WebElement e7 = driver.findElement(By.xpath("//a[.='English']"));
		
		Actions a=new Actions(driver);
		Robot r=new Robot();
						
		List<WebElement> al=new ArrayList<WebElement>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		
		
		
		for(WebElement ele:al)
		{
			a.contextClick(ele).build().perform();
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		Set<String> all_window = driver.getWindowHandles();
		
		for(String id:all_window)
		{
			
			System.out.println(id);
		}
		
		for(String id:all_window)
		{
			Thread.sleep(1000);
			driver.switchTo().window(id);
			String title = driver.getTitle();
			
			System.out.println(title);
		}
		ArrayList<String> al1=new ArrayList<String>(all_window);
		String s1 = al1.get(2);
		driver.switchTo().window(s1);
		Thread.sleep(2000);
		driver.close();
		
		//driver.quit();
	
	}

}
