package sample;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_browser_to_specific_coordinate {

	public static void main(String[] args) throws InterruptedException {
	
		String Key="webdriver.chrome.driver";
		String Value="./Software/chromedriver.exe";
		
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//To bring browser at specific pint/co-ordinate value--->>
		Point p=new Point(200, 500);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.quit();
	}

}
