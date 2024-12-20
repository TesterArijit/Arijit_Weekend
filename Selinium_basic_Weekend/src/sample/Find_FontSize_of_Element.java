package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_FontSize_of_Element {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement	e=driver.findElement(By.name("login"));
		//for font size---->>
		  String cssValue = e.getCssValue("font-size");
		  System.out.println(cssValue);
		//for line-height--->>
		  
		 String cssValue2 = e.getCssValue("line-height");
		 System.out.println(cssValue2);

	}

}
