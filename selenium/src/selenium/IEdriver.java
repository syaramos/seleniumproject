package selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriver {
	

	 public static String driverPath = "C:\\Users\\yaram\\Downloads\\IEDriverServer_x64_3.8.0";
	 public static WebDriver driver;
	 
		public static void main(String []args) throws Exception {
			System.out.println("launching ie browser");
			System.setProperty("webdriver.ie.driver", driverPath+"IEdriver.exe");
			driver = new InternetExplorerDriver();
			//driver.navigate().to("http://google.com");
			driver.get("https://google.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();

		}
}
