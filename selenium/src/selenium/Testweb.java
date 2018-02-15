package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testweb {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yaram\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		Thread.sleep(2000);
        //driver.findElement(By.name("fromPort"));
		
		//WebElement objweb = driver.findElement(By.name("birthday_month"));
		
		Select selectmonth = new Select(driver.findElement(By.id("month")));
		selectmonth.selectByIndex(2);
		
		Select selectday = new Select(driver.findElement(By.id("day")));
		selectday.selectByValue("20");
		Thread.sleep(2000);
		
		Select selectyear = new Select(driver.findElement(By.id("year")));		
		selectyear.selectByValue("2016");
		Thread.sleep(2000);
		
		//driver.findElement(By.name("sex")).click();
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
