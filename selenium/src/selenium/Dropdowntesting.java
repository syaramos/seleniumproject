package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntesting {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yaram\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(2000);
			
		driver.findElement(By.name("userName")).sendKeys("Mercury");
		driver.findElement(By.name("password")).sendKeys("Mercury");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("fromPort"));
		
		WebElement objweb = driver.findElement(By.name("fromport"));
		Select objselect = new Select(objweb);
		
		objselect.selectByIndex(2);
		
		objselect.selectByValue("Paris");
		
		objselect.selectByVisibleText("Portland");
		
				}
}
