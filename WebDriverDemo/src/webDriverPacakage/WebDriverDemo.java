package webDriverPacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverDemo {

	public static void main(String[] args) {
		//Add Chrome Driver executable file
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Course\\Automation Course\\chromedriver_win32 (2)\\chromedriver.exe");
		//New object created from webdriver instance driver
		WebDriver Driver = new ChromeDriver();
		//Navigate to URL from chrome driver
		Driver.navigate().to("http://www.google.com");
		//FireFox driver
		System.setProperty("webdriver.gecko.driver", "D:\\Testing Course\\Automation Course\\geckodriver-v0.28.0-win32\\geckodriver.exe");
		WebDriver FireFox = new FirefoxDriver();
		//open FireFox Driver
		
		FireFox.navigate().to("http://www.amazon.com");
		
		

	}

}
