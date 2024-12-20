package sample;
//Alert and confirmation popup

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Interface1_Control_Transfer {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement cid = driver.findElement(By.name("cusid"));
		cid.sendKeys("Hello");
		Thread.sleep(1000);
		WebElement sub = driver.findElement(By.name("submit"));
		sub.click();
		Thread.sleep(1000);
		//To transfer the control from webpage to popup--->
		Alert al = driver.switchTo().alert();
		al.accept(); // To accept the pop up
		//al.dismiss();// To cancel/reject the request.
		Thread.sleep(1000);
		driver.quit();
	
	}

}
