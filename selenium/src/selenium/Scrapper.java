package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrapper {
	
		public static void main(String[] args) throws Exception {
	    String strxpath;
	    
	    List<WebElement> Searchpageresults;
	    List<String>alllinktext = new ArrayList<>();
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yaram\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		for(int i=1;i<=5;i++) {
			if(i>1) {
			
			strxpath = "//a[@class='fl' and text()='"+i+"']";
			driver.findElement(By.xpath(strxpath)).click();
			Thread.sleep(2000);
			}
			Searchpageresults = driver.findElements(By.xpath("//div[@class='rc']/h3/a"));
		    for(WebElement link: Searchpageresults) {
		    	alllinktext.add(link.getText());
		    }
		    for(String eachlinktext:alllinktext) {
		    	System.out.println(eachlinktext);
		    }
			}
		driver.close();
		driver.quit();
		}
}
