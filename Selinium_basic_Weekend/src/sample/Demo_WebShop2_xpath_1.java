package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WebShop2_xpath_1 {

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
		driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@href='/cart' and text()='Shopping cart']\r\n"
				+ "")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox' and @name='removefromcart']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(3000);
		
		driver.quit();


	}

}
