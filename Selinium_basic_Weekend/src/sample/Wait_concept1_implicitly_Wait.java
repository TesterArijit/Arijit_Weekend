package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_concept1_implicitly_Wait {
	
	public static void main(String[] args) throws InterruptedException {
		
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Arijit");
		
		driver.findElement(By.id("LastName")).sendKeys("Chatterjee");
		
		driver.findElement(By.id("Email")).sendKeys("chatterjeearijit1991@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("ABCDabc123@!");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ABCDabc123@!");
		
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("chatterjeearijit1991@gmail.com");
		
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("ABCDabc123@!");
		
		driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
		
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
		
		driver.quit();
		
		
	}
	
}
