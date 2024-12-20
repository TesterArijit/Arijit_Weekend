package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_on_Grur99 {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement double_click = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		
		Actions a=new Actions(driver);
		a.doubleClick(double_click).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
