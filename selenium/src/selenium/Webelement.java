package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yaram\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("http://newtours.demoaut.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		WebElement obj;
		driver.findElement(By.name("email")).sendKeys("Mercury");
		driver.findElement(By.name("password")).sendKeys("Mercury");
		driver.findElement(By.name("confirmPassword")).sendKeys("Mercury");
		Thread.sleep(2000);
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
