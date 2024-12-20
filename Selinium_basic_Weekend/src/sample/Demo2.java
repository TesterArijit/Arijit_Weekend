package sample;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.gecko.driver";
		String value ="./Software/geckodriver.exe";
		
		System.setProperty(key, value);
		
		 FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.close();

	}

}
