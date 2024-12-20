package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown_reversesort {

	public static void main(String[] args) throws InterruptedException {
		
		String Key="webdriver.chrome.driver";
		String Value="./Software/chromedriver.exe";
		
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(e);
		List<WebElement> op = s.getOptions();
		
		ArrayList<String> t=new ArrayList<String>();
		
		for(WebElement ele:op)
		{
			String text = ele.getText();
			System.out.println(text);
			t.add(text);
			
		}
		Collections.sort(t,Collections.reverseOrder());
		System.out.println(t);
		for(String P:t)
		{
			System.out.println(P);
		}
		
		driver.quit();
	
	}

}
