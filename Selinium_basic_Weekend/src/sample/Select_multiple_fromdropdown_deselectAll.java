package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_multiple_fromdropdown_deselectAll {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/Sublime-HTML/Multiselectdropdown.html");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("aoi"));
		
		Select s=new Select(e);
		//Select the option of the dropdown using index.
		  s.selectByIndex(1); //Diploma
		  Thread.sleep(1000);
		  
		//Select the option of the dropdown using Value.
		  s.selectByValue("4"); //B.tech
		  Thread.sleep(1000);
		  
		  
		  //Select the option of the dropdown using visibleText
		  s.selectByVisibleText("M.Arch");
		  Thread.sleep(1000);
		  s.deselectAll();
		  Thread.sleep(1000);
		  driver.quit();
	
	}

}
