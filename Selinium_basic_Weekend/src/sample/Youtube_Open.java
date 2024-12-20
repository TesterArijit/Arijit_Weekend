package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Open {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("fossils song");
		Thread.sleep(3000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("img[src='https://i.ytimg.com/vi/T71ZyjvCtOA/hqdefault.jpg?sqp=-oaymwE2COADEI4CSFXyq4qpAygIARUAAIhCGAFwAcABBvABAfgB_gmAAtAFigIMCAAQARgdIFIofzAP&rs=AOn4CLCtA3rmiR_qUF_9Kzjc8zFkVrhc1g']")).click();
		Thread.sleep(12000);
		
		driver.quit();

	}

}
