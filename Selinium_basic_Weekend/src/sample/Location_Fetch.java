package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location_Fetch {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement	e=driver.findElement(By.id("email"));
		
		            Point loc = e.getLocation();
		            System.out.println(loc);
		            System.out.println(loc.getX());
		            System.out.println(loc.getY());
		            Thread.sleep(2000);
		        	driver.quit();
		
	}

}
