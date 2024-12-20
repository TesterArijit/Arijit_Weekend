package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchText_ofFirstselected_option_inDropdown {

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
		  s.selectByIndex(2); //PGDA
		  Thread.sleep(1000);
		  
		//Select the option of the dropdown using Value.
		  s.selectByValue("4"); //B.tech
		  Thread.sleep(1000);
		  
		  
		  //Select the option of the dropdown using visibleText
		  s.selectByVisibleText("M.Arch");
		  Thread.sleep(1000);
		  
		 WebElement firstSelectedOption = s.getFirstSelectedOption();
		  String text = firstSelectedOption.getText();
		  System.out.println(text);
		  Thread.sleep(1000);
		  driver.quit();

	}

}
