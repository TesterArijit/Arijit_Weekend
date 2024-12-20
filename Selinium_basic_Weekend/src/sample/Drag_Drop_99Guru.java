package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_99Guru {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement source1 = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source1, target1).build().perform();
		Thread.sleep(2000);
		
		WebElement source2 = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
	    a.dragAndDrop(source2, target2).build().perform();
		Thread.sleep(2000);
				
		WebElement source3 = driver.findElement(By.xpath("//a[.=' SALES ']"));
		WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		a.dragAndDrop(source3, target3).build().perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
