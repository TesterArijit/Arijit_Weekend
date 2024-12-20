package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass_data_Alert_and_Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//a[.='Alert with Textbox ']"));
		e.click();
		Thread.sleep(1000);
		WebElement e1 = driver.findElement(By.xpath("//button[.='click the button to demonstrate the prompt box ']"));
		e1.click();
		//For passing data---->
		Alert al = driver.switchTo().alert();
		Thread.sleep(1000);
		al.sendKeys("Java Selenium");
		Thread.sleep(4000);
		al.accept();
		Thread.sleep(1000);
		driver.quit();
		
		

	}

}
