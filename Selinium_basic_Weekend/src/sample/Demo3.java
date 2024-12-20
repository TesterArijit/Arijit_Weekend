package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		// to get the tittle of the page ------>>
		String tittle=driver.getTitle();
		System.out.println(tittle);
		// to get the CurrentUrl of the page ------>>
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// to get the PageSource of the page ------>>
		String source =driver.getPageSource();
		System.out.println(source);
		Thread.sleep(5000);
		driver.quit();

	}

}
