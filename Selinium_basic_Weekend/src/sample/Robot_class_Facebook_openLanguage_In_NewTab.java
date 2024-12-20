package sample;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//WAP to perform right click operation on any language in facebook, the open this in a new tab.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_class_Facebook_openLanguage_In_NewTab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement bong = driver.findElement(By.xpath("//a[.='বাংলা']"));
		//Right click operation.
		Actions a=new Actions(driver);
		a.contextClick(bong).build().perform();
		Thread.sleep(2000);
		
		//For open the language in new tab---->>
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(4000);
		driver.quit();
	
	}

}
