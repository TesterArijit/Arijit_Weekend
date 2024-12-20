package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_a {
     
	public static void main(String[] args) throws InterruptedException {
		
	String key ="webdriver.chrome.driver";
	String value ="./Software/chromedriver.exe";
		
	System.setProperty(key, value);
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("chatterjeearijit1991@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[class='password']")).sendKeys("ABCDabc123@!");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
	Thread.sleep(2000);
//	WebElement e = driver.findElement(By.xpath("(//li/ul[@class='sublist firstLevel']/li[2]/a)[4]"));
//	e.click();
	Thread.sleep(4000);
	driver.quit();
		
		

	}

}
