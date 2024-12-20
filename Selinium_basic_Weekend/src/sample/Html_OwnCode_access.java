package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_OwnCode_access {

	public static void main(String[] args) throws InterruptedException {
		
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/Sublime-HTML/form01.html");
		// to get the tittle of the page ------>>
				String tittle=driver.getTitle();
				System.out.println(tittle); //Practice Of Form
		Thread.sleep(4000);
		driver.quit();
		

	}

}
