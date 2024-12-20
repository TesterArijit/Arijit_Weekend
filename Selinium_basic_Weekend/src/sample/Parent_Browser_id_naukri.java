package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Browser_id_naukri {

	public static void main(String[] args) throws InterruptedException {
		String Key="webdriver.chrome.driver";
		String Value="./Software/chromedriver.exe";
		
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Services']")).click();
		Thread.sleep(3000);
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		driver.quit();

	}

}
