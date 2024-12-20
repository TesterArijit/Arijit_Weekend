package wait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Presence_of_all_elements_located_by {

	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";

		System.setProperty(key, value);

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		By search = By.tagName("a");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		List<WebElement> presence = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(search));

//get the number of authors found
		int presentcount = presence.size();
		System.out.println(presentcount);

	}

}
