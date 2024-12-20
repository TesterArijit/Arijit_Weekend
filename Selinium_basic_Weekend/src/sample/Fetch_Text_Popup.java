package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Text_Popup {

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
		Alert al = driver.switchTo().alert();
		//To get the text of the alert, present in Alert interface
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.quit();
		
	}

}
