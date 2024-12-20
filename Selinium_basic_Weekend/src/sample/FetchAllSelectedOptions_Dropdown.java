package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchAllSelectedOptions_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/Sublime-HTML/Multiselectdropdown.html");
		driver.manage().window().maximize();
	    WebElement e = driver.findElement(By.id("aoi"));
		
		 Select s=new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for(WebElement ele:allSelectedOptions)
		{
		  String text = ele.getText();
		  Thread.sleep(2000);
		  System.out.println(text);
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
