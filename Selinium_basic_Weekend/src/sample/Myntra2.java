package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra2 {

	public static void main(String[] args) throws InterruptedException {
		String Key = "webdriver.chrome.driver";
		String Value = "./Software/chromedriver.exe";

		System.setProperty(Key, Value);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("HRX shoes" + Keys.ENTER);
		Thread.sleep(4000);
		WebElement hover = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));

		Actions a = new Actions(driver);
		a.moveToElement(hover).build().perform();
		Thread.sleep(3000);

		WebElement whats_new = driver.findElement(By.xpath("//input[@value='new' and @type='radio']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", whats_new);
		Thread.sleep(3000);

		WebElement first = driver.findElement(By.xpath("//section[@style='width: 100%;']/ul/li"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(first).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[.='wishlist'])[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
