package sample;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoWebShop_cart_message_display_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		//driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']")).click();
		//Thread.sleep(2000);
				
		List<WebElement> Allcart = driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
		int count = Allcart.size();
		Thread.sleep(2000);
		System.out.println(count);
				
		
		for(WebElement ele: Allcart)
		{ 
			Thread.sleep(2000);
			try {			
			ele.click();
			Thread.sleep(2000);
			WebElement msg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
			
			if(msg.isDisplayed())
			{
				Thread.sleep(2000);
				WebElement cart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
				Thread.sleep(1000);
				cart.click();
				Thread.sleep(2000);
						
				String path="E:\\Selenium_Screenshot_folder\\";
				String format=".png";
				Date d=new Date();
				String s1 = d.toString();
				String date = s1.replace(":", "-");
								
				TakesScreenshot tc=(TakesScreenshot) driver;
				File source = tc.getScreenshotAs(OutputType.FILE);
				File destination=new File(path+date+format);
				FileHandler.copy(source, destination);
				Thread.sleep(2000);
				driver.navigate().back();
				
				
			}
			}
			catch(Exception e1 ) {
			
			{
				
				Thread.sleep(2000);
				driver.navigate().back();
			}
			}
		}
			
		driver.quit();

	}

}
