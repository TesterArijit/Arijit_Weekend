package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division {

	public static void main(String[] args) throws InterruptedException {
		String Key="webdriver.chrome.driver";
		String Value="./Software/chromedriver.exe";
		
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 driver.findElement(By.id("dateOfBirthInput")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='22']")).click();
		Thread.sleep(1000);
		driver.quit();
	
	}

}
