package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_isMultiple_Method1 {

	public static void main(String[] args) {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/Sublime-HTML/Multiselectdropdown.html");
		WebElement e = driver.findElement(By.id("aoi"));
		
		Select s=new Select(e);
		boolean dis = s.isMultiple();
		if(dis)
		{
			System.out.println("Dropdown is multiple");
		}
		else
		{
			System.out.println("Dropdown is single");
		}
		
	}

}
