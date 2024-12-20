package ddt2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_insert_Runner2 {
	static String val;

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/automation-practice-form");
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
						
		
			for(int j=0;j<=6;j++)
			{
				Thread.sleep(1000);
				 val = Data_driven_Generic2.data_given2("practice1", j, 0);
			}
			System.out.println(val);
//		
//		WebElement e1 = driver.findElement(By.xpath("//input[@id='firstName']"));
//		e1.sendKeys(val);
//		Thread.sleep(1000);
//		WebElement e2 = driver.findElement(By.xpath("//input[@id='lastName']"));
//		e2.sendKeys(val);
//		Thread.sleep(1000);
//		
//		driver.quit();
	
	}

}
