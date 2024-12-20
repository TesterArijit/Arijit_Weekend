package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputfield_passvalue_clearodd {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Sublime-HTML/html/field.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> e = driver.findElements(By.xpath("//input"));
		                
		
		int count=e.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement ele = e.get(i);
			ele.sendKeys("Automation");
		}
		
		for(int i=0;i<count;i++)
		{
			if(i%2==0)
			{
				WebElement ele = e.get(i);
				
			   ele.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
