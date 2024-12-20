package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploadpopup {

	public static void main(String[] args) throws InterruptedException {
		String Key="webdriver.chrome.driver";
		String Value="./Software/chromedriver.exe";
		
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Sublime-HTML/html/file_upload1.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\chatt\\Downloads\\Trapezium01.java");
		Thread.sleep(1000);
		driver.quit();

	}

}
