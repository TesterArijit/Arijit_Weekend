package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept_ExplicitlyWait1 {

	public static void main(String[] args) {
		
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("//button[.='Login']"));
		
		WebDriverWait w= new WebDriverWait(driver, 30);
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleContains(title));
		login.click();
		driver.quit();
		
		
		

	}

}
