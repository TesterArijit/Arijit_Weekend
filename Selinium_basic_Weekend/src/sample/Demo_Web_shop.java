package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Web_shop {
	
	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		for(int i=1;i<=4;i++) {
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Arijit");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Chatterjee");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("chatterjeearijit1991@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("ABCDabc123@!");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ABCDabc123@!");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("chatterjeearijit1991@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("ABCDabc123@!");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
		Thread.sleep(2000);
		
		}
		driver.quit();
		
	}

}
