package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Height_anf_widthof_element {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement	e=driver.findElement(By.name("login"));
		
		       Dimension dim1 =e.getSize();
		       System.out.println(dim1);
		       System.out.println(dim1.getHeight());
		       System.out.println(dim1.getWidth());
		       Thread.sleep(2000);
		   	driver.quit();
		

	}

}
