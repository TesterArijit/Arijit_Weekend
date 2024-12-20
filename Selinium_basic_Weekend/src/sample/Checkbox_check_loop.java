package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_check_loop {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Sublime-HTML/html/checkbox.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> e = driver.findElements(By.xpath("//input"));
		
		int count=e.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement ele = e.get(i);
			ele.click();
		}
		Thread.sleep(2000);
		
		for(int i=count-1;i>=0;i--)
		{
			if(i%2!=0)
			{
				WebElement ele = e.get(i);
				
				ele.click();
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
