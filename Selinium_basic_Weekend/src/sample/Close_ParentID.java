package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_ParentID {
	public static void main(String[] args) throws InterruptedException {
		String Key = "webdriver.chrome.driver";
		String Value = "./Software/chromedriver.exe";

		System.setProperty(Key, Value);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Services']")).click();
		Thread.sleep(3000);
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		Set<String> all_id = driver.getWindowHandles();

		for (String id : all_id) {
			Thread.sleep(3000);
			System.out.println(id);
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(id.equals(p_id))
			{
				driver.close();
			}

		}

	}

}
