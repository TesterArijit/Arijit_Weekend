package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop_cart1 {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='top-menu'] |//a[text()='Apparel & Shoes']\r\n"
				+ "")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']")).click();
		Thread.sleep(2000);
	WebElement	e=driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']"));
	            e.click();
		Thread.sleep(3000);
    WebElement  msg=driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
         
    boolean view =msg.isDisplayed();
    
    if(view) {
    	System.out.println("Add to cart message is displayed.");
    WebElement	cart=driver.findElement(By.linkText("Shopping cart"));
               Thread.sleep(2000);
                cart.click();
                driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@name='updatecart']")).click();
                Thread.sleep(2000);
    	
    }
    else
    {
    	System.out.println("Add to cart message is not displayed.");
    }
    driver.quit();
			
	}
	//(//div[@class='center-1']/div/div|//div[@class='order-summary-content'])[2]

}
