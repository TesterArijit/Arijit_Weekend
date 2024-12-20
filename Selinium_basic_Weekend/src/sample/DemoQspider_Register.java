package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspider_Register {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name' ]")).sendKeys("Arijit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chatterjee@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234545AB");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chatterjee@gmail.com");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("1234545AB");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/ui/button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes' and @id='btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes' and @id='btn2']")).click();
		Thread.sleep(3000);
	   driver.quit();


	}

}
