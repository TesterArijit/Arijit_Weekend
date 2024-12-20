package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_and_confirmation_popup {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement button1 = driver.findElement(By.xpath("//div[@class='tab-content']/div/button[@class='btn btn-danger']"));
		button1.click();
		Thread.sleep(2000);
		
		//Alert with OK---->
		
		Alert al1 = driver.switchTo().alert();
		Alert al = al1;
		al.accept();
		Thread.sleep(2000);
		//Alert with OK and Cancel---->
		WebElement e = driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']"));
		e.click();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//button[.='click the button to display a confirm box ']"));
		e1.click();
		Thread.sleep(2000);
		driver.switchTo().alert();
		al1.dismiss(); // To dismiss the message
		Thread.sleep(2000);	
		driver.quit();
	
	}

}
