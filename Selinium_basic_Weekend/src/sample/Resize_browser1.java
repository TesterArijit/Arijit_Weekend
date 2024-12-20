package sample;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_browser1 {

	public static void main(String[] args) throws InterruptedException {
		String Key="webdriver.chrome.driver";
		String Value="./Software/chromedriver.exe";
		
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Used Dimention Class to resize browser--->>
		Dimension d =new Dimension(200, 400);
		
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		driver.quit();

	}

}
