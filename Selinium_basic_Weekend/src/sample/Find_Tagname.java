package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Tagname {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement	e=driver.findElement(By.id("passContainer"));
		Thread.sleep(2000);
		
		        String tag = e.getTagName();
		        System.out.println(tag);
		        Thread.sleep(1000);
		       	driver.quit();

	}

}
