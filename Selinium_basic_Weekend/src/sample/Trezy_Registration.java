package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Trezy_Registration {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver =new ChromeDriver();
		// to get the chrome driver
		driver.get("https://trezy.pages.dev");
		Thread.sleep(2000);
		//to maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("AuthBoxRow--name")).click();
		Thread.sleep(2000);
		// enter email id --->>
		 driver.findElement(By.cssSelector("input[name='loginfmt']")).sendKeys("AChatterjee@raileurope.com",Keys.ENTER);
		 Thread.sleep(2000);
		// enter password --->>
		 driver.findElement(By.id("i0118")).sendKeys("Europe$7959");
		 Thread.sleep(2000);
		 driver.findElement(By.id("idSIButton9")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("idSIButton9")).click();
		 Thread.sleep(2000);
		 //registor button click
		 driver.findElement(By.linkText("Register")).click();
		 Thread.sleep(2000);
		 // Filling registration form
		 driver.findElement(By.id("firstName")).sendKeys("Arijit");
		 Thread.sleep(2000);
		 driver.findElement(By.id("lastName")).sendKeys("Chatterjee");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("watercolour.arijit@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[placeholder='**********']")).sendKeys("ARIJITraileurope");
		Thread.sleep(10000);
	
	
		driver.quit();
		

	}

}
