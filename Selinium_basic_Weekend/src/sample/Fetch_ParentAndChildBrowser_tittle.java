package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_ParentAndChildBrowser_tittle {

	public static void main(String[] args) throws InterruptedException {
	  
		
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Services']")).click();
		Thread.sleep(2000);
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		Set<String> all_window = driver.getWindowHandles();
		
		for(String id:all_window)
		{
			Thread.sleep(3000);
			System.out.println(id);
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			
			
		}
		driver.quit();
		

	}

}
