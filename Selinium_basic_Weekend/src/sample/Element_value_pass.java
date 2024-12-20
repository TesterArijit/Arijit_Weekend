package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_value_pass {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Selinium");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("321654987");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		driver.quit();

	}

}
