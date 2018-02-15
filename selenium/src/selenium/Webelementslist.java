package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementslist {
	 public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\yaram\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com");
				
			List<WebElement> objlinks = driver.findElements(By.tagName("a"));
			for(WebElement objcurrentlink : objlinks) {
				String StrLinktest = objcurrentlink.getText();
				System.out.println(StrLinktest);
			} 
			driver.close();
	 }
}
