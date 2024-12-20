package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Web_shop1 extends Demo_Web_shop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.linkText("Log in")).click();
		

	}

}
