package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest
{
	

	 public static String driverPath = "C:\\Users\\yaram\\Downloads\\chromedriver_win32\\";
	 public static WebDriver driver;
	 
		public static void main(String []args) throws Exception {
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			//driver.navigate().to("http://google.com");
			driver.get("https://google.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();

		}
}
