package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertIspresent_or_not {
//Alert is Present: It is used to detect the presence of any alert or popup
	public static void main(String[] args) {
		
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		driver.findElement(By.name("cusid")).sendKeys("hello");
		WebElement e = driver.findElement(By.name("submit"));
		e.click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		//To verify/check the presence of alert or pop-up
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.quit();
	
	}

}
