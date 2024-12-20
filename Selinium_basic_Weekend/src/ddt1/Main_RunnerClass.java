package ddt1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_RunnerClass {

	public static void main(String[] args) throws InterruptedException {
		
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='top-menu'] |//a[text()='Apparel & Shoes']\r\n"
				+ "")).click();
		Thread.sleep(2000);
		
		
		List<WebElement> all_name = driver.findElements(By.xpath("//h2[@class='product-title']"));
		int count = all_name.size();
		Thread.sleep(1000);
		for(WebElement ele:all_name)
		{
		   String name = ele.getText();
			System.out.println(name);
			Thread.sleep(1000);
		}
				
		List<WebElement> all_rating = driver.findElements(By.xpath("//div[@class='rating']"));
		//int count1 = all_rating.size();
		Thread.sleep(1000);
		for(WebElement ele:all_rating)
		{
		   String rating = ele.getText();
			System.out.println(rating);
			Thread.sleep(1000);
		}
				
		List<WebElement> all_price = driver.findElements(By.xpath("//div[@class='prices']"));
		//int count2 = all_price.size();
		Thread.sleep(1000);
		for(WebElement ele:all_price)
		{
		   String price = ele.getText();
			System.out.println(price);
			Thread.sleep(1000);
		}
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<count;j++) 
			{
				
			}
		}
			
	Generic_ddt2.DDT_create(value, 0, 0, "practice1");
	}

}
