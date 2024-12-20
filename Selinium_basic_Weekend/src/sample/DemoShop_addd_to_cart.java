package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShop_addd_to_cart {
	
	static boolean displayes;

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//a[.='Log in']")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dummy53985738573@gmail.com");
		Driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test@12345");
		Driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a")).click();
		Driver.findElement(By.xpath(
				"//a[contains(text(),'Rockabilly Polka Dot Top JR Plus Size')]/../../../div[2]/div[3]/div[2]/input"))
				.click();
		try {
			WebElement msg = Driver.findElement(By.xpath("//div[@class='bar-notification success']/p"));
			boolean displayed1 = msg.isDisplayed();
			displayes = displayed1;
		} catch (Exception e) {
			if (displayes) {
				System.out.println("Displayed");
			} else {
				Generic_screenshot.sc(Driver);
			}
			Driver.close();
		}

	}

	}


