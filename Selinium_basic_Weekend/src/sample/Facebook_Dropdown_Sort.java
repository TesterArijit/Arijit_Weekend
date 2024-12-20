package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Dropdown_Sort {

	public static void main(String[] args) throws InterruptedException {
		String Key="webdriver.chrome.driver";
		String Value="./Software/chromedriver.exe";
		
		System.setProperty(Key,Value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement e = driver.findElement(By.xpath("//a[text()='Create new account']"));
	           e.click();
	           Thread.sleep(2000);
	           //Select dropdown tab of month in account creation
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(month);
	       List<WebElement> opt = s.getOptions();
	       
	       ArrayList<String> al=new ArrayList<String>();
	       
	       for(WebElement ele:opt)
	       {
	    	   String text = ele.getText();
	    	   System.out.println(text);
	    	   Thread.sleep(2000);
	    	   al.add(text); // adding the text element in to array list
	       }
	       
	       System.out.println(al);// print the array list
           
	       Collections.sort(al);// sorting the arraylist
	       System.out.println(al);
	       
	       //Again for each loop--->> to get the month name in sorted manner
	       for(String ele:al)
	       {
	    	   System.out.println(ele);
	       }
	       
	       
	     driver.quit();  
	
	}

}
